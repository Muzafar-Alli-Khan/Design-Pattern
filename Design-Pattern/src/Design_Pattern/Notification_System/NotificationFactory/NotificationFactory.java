package Design_Pattern.Notification_System.NotificationFactory;

import Design_Pattern.Notification_System.Components.Email_Notification;
import Design_Pattern.Notification_System.Components.Notification;
import Design_Pattern.Notification_System.Components.PushNotification;
import Design_Pattern.Notification_System.Components.SMSNotification;



public class NotificationFactory {

	public static Notification setNotification(String type) {

		if (type.equalsIgnoreCase("email")) 
		{
			return new Email_Notification();
		} 
		else if (type.equalsIgnoreCase("sms"))
		{   
			return new SMSNotification();  
		} 
		else if (type.equalsIgnoreCase("push")) 
		{
			return new PushNotification();      
		} 
		else 
		{
			throw new IllegalArgumentException("Unknown channel");
		}
	}
}
