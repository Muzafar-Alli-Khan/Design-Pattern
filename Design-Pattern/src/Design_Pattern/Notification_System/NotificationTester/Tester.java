package Design_Pattern.Notification_System.NotificationTester;

import java.util.Scanner;

import Design_Pattern.Notification_System.Components.Notification;
import Design_Pattern.Notification_System.NotificationFactory.NotificationFactory;



public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("Email Notification");
		System.out.println("SMS Notification");
		System.out.println("Push Notification");
		System.out.println("============================");
		
		System.out.println("Enter Your Choice");
		String choice = sc.nextLine();
		Notification sms =NotificationFactory.setNotification(choice);
		
		System.out.println("Sent What You Waht to send ");
		String message = sc.nextLine();
		sms.send(message);
		
		sc.close();
	}
	
}
