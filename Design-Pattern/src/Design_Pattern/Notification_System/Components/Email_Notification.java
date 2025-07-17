package Design_Pattern.Notification_System.Components;

public class Email_Notification implements Notification {

	@Override
	public void send(String message) {

		System.out.println("Email_Notification.send()");
		System.out.println("Sending Email :"+message);

	}

}
