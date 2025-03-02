package com.mujeeb.mosquedashboard.grpc.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mujeeb.mosquedashboard.grpc.EmptyRequest;
import com.mujeeb.mosquedashboard.grpc.GenericReply;
import com.mujeeb.mosquedashboard.grpc.GetDataForMobileAppRequest;
import com.mujeeb.mosquedashboard.grpc.HijriAdjustmentUpdateRequest;
import com.mujeeb.mosquedashboard.grpc.MosqueDashboardServiceGrpc;
import com.mujeeb.mosquedashboard.grpc.MosqueDashboardServiceGrpc.MosqueDashboardServiceBlockingStub;
import com.mujeeb.mosquedashboard.grpc.MosqueDashboardServiceGrpc.MosqueDashboardServiceStub;
import com.mujeeb.mosquedashboard.grpc.NamazTime;
import com.mujeeb.mosquedashboard.grpc.ScreenSaverStateUpdateRequest;
import com.mujeeb.mosquedashboard.grpc.StringContainer;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MosqueDashboardClient  {
	
	protected static ManagedChannel channel;
	protected static MosqueDashboardServiceBlockingStub blockingStub;
	protected static MosqueDashboardServiceStub asyncStub;
	
	public MosqueDashboardClient(String host, int port) throws IOException {
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
	}

	public MosqueDashboardClient(ManagedChannelBuilder<?> channelBuilder) {
		  channel = channelBuilder.build();
		  blockingStub = MosqueDashboardServiceGrpc.newBlockingStub(channel);
		  asyncStub = MosqueDashboardServiceGrpc.newStub(channel);
	}
	
	public static GetDataForMobileAppRequest getDataForMobileApp() {
		return blockingStub.getDataForMobileApp(EmptyRequest.newBuilder().build());
	}
	
	public static GenericReply changeNamazTime(String timeName, int hour, int minute) {
		
		NamazTime request = NamazTime.newBuilder()
						.setNamazTimeName(timeName)
						.setHour(hour)
						.setMinute(minute).build();
		
		return blockingStub.updateNamazTime(request);
	}
	
	public static GenericReply changeHijriAdjustment(int hijriAdjustment) {
		
		return blockingStub.changeHijriAdjustment(HijriAdjustmentUpdateRequest.newBuilder().setHijriAdjustment(hijriAdjustment).build());
	}
	
	public static GenericReply testAudio() {
		
		return blockingStub.testAudio(EmptyRequest.newBuilder().build());
	}
	
	public static GenericReply changeScreenSaverState(boolean state) {
		
		return blockingStub.changeScreenSaverState(ScreenSaverStateUpdateRequest.newBuilder().setIsOn(state).build());
	}
	
	public static GenericReply changeDateTime(String dateTime) {
		
		return blockingStub.setDateTime(StringContainer.newBuilder().setStr(dateTime).build());
	}
	
	public static GenericReply restartSystem() {
		
		return blockingStub.restartSystem(EmptyRequest.newBuilder().build());
	}
	
	public static void main(String[] args) throws IOException {
		
		if(args.length < 1) {
			System.out.println("Usage: MosqueDashboardClient <RemoteHost>");
			return;
		}
		
		String host = args[0];
		try {
			new MosqueDashboardClient(host, 8090);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Welcome to Mosque Dashboard gRPC test, by Mujeeb Mohammad");
		
		while(true) {
			System.out.println("\n");
			
			System.out.println("1. Get Data for Mobile App");
			System.out.println("2. Change Namaz Time");
			System.out.println("3. Change Hijri Adjustment");
			System.out.println("4. Test Audio");
			System.out.println("5. Change Screen Saver State");
			System.out.println("6. Change Date/Time");
			System.out.println("7. Restart System");
			System.out.println("8. Exit\n");
			
			System.out.print("Enter your choice: ");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line = reader.readLine();
			
			switch(line) {
				case "1":
						  System.out.println("Got the data successfully: " + getDataForMobileApp().toString());
						  break;
				case "2":
						  System.out.println("\nEnter new namaz time details in this format: <Namaz Time> <Hour> <Minute>:");
						  String[] time = reader.readLine().split(" ");
						  if(time.length < 3) {
							  System.out.println("Invalid entry.");
							  break;
						  }
						  GenericReply reply = changeNamazTime(time[0], Integer.parseInt(time[1]), Integer.parseInt(time[2]));
						  System.out.println(reply.getResponseCode() + ":" + reply.getDescription());
						  break;
				case "3":
						  System.out.print("\nEnter Hijri Adjustment value: ");
						  String strAjustment = reader.readLine();
						  int adjustment;
						  try {
							adjustment = Integer.parseInt(strAjustment);  
						  }catch(Exception ex) {
							  System.out.println("Invalid entry.");
							  break;
						  }
						  reply = changeHijriAdjustment(adjustment);
						  System.out.println(reply.getResponseCode() + ":" + reply.getDescription());
						  break;
				case "4":
						  reply = testAudio();
						  System.out.println(reply.getResponseCode() + ":" + reply.getDescription());
						  break;
				case "5":
						  System.out.print("\nEnter new Screen Saver state (on/off):");
						  String strState = reader.readLine().toUpperCase();
						  boolean newState;
						  if(strState.equals("ON")) {
							newState = true;  
						  } else if(strState.equals("OFF")) {
							newState = false;
						  } else {
							System.out.println("Invalid entry.");
							break;
						  }
						  reply = changeScreenSaverState(newState);
						  System.out.println(reply.getResponseCode() + ":" + reply.getDescription());
						  break;
				case "6":
						  System.out.print("\nEnter new Date/Time in format \"dd MMM yyyy HH:mm:ss\", for example \"1 MAR 2025 16:33:25\": ");
					      String strDateTime = reader.readLine();
						  reply = changeDateTime(strDateTime);
						  System.out.println(reply.getResponseCode() + ":" + reply.getDescription());
						  break;
				case "7":
						  reply = restartSystem();
						  System.out.println(reply.getResponseCode() + ":" + reply.getDescription());
						  break;
				case "8":
						  System.exit(0);
				default:
						  System.out.println("\nPlease enter a valid Option.");
						  break;
			}
		}
	}
}
