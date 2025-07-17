package Design_Pattern.Notification_System.Components;

public class PushNotification implements Notification {

	@Override
	public void send(String message) {
		System.out.println("PushNotification.send()");
		System.out.println("Sending SMS :" + message);

	}

}
