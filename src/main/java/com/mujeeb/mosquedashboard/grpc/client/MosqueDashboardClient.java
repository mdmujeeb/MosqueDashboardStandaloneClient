package com.mujeeb.mosquedashboard.grpc.client;

import java.io.IOException;

import com.mujeeb.mosquedashboard.grpc.generated.GenericReply;
import com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest;
import com.mujeeb.mosquedashboard.grpc.generated.UpdateNamazTimeGrpc;
import com.mujeeb.mosquedashboard.grpc.generated.UpdateNamazTimeGrpc.UpdateNamazTimeBlockingStub;
import com.mujeeb.mosquedashboard.grpc.generated.UpdateNamazTimeGrpc.UpdateNamazTimeStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class MosqueDashboardClient  {
	
	protected static ManagedChannel channel;
	protected static UpdateNamazTimeBlockingStub blockingStub;
	protected static UpdateNamazTimeStub asyncStub;

	public MosqueDashboardClient(String host, int port) throws IOException {
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
	}

	/** Create a RouteGuide server using serverBuilder as a base and features as data. */
	public MosqueDashboardClient(ManagedChannelBuilder<?> channelBuilder) {
		  channel = channelBuilder.build();
		  blockingStub = UpdateNamazTimeGrpc.newBlockingStub(channel);
		  asyncStub = UpdateNamazTimeGrpc.newStub(channel);
	}
	
	public static void sendRequestToServer(String timeName, int hour, int minute) {
		
		NamazTimeUpdateRequest request = NamazTimeUpdateRequest.newBuilder()
						.setNamazTimeName(timeName)
						.setHour(hour)
						.setMinute(minute).build();
		
		asyncStub.updateNamazTime(request, new StreamObserver<GenericReply>() {
			
			@Override
			public void onNext(GenericReply reply) {
				System.out.println(reply.getResponseCode() + ":" + reply.getDescription());
			}
			
			@Override
			public void onError(Throwable error) {
				error.printStackTrace();
			}
			
			@Override
			public void onCompleted() {
				System.out.println("Request Completed.");
			}
		});
//		System.out.println(blockingStub.updateNamazTime(request));
	}
	
	public static void main(String[] args) {
		
		if(args.length < 4) {
			System.out.println("Usage: MosqueDashboardClient <Host> <NamazTimeName> <Hour> <Minute>");
			return;
		}
		
		String host = args[0];
		String namazTimeName = args[1];
		int hour = Integer.parseInt(args[2]);
		int minute = Integer.parseInt(args[3]);
		
		try {
			new MosqueDashboardClient(host, 8090);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		sendRequestToServer(namazTimeName, hour, minute);
		
		new Thread() {
			public void run() {
				for(int i=0; i<5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
