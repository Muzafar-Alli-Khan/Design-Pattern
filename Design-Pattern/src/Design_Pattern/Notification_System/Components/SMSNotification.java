package Design_Pattern.Notification_System.Components;

public class SMSNotification implements Notification
{

	@Override
	public void send(String message) {
		
		System.out.println("SMSNotification.send()");
		System.out.println("Sending Message :"+message);
	}
	

}
