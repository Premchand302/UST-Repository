package assignment_1;

class Notification{
	void send() {
		System.out.println("Sending notification");
	}
}
class EmailNotification extends Notification{
	@Override
	void send() {
		System.out.println("Sending email");
	}
}
class SMSNotification extends Notification{
	@Override
	void send() {
		System.out.println("Sending SMS");
	}
}
public class Assignment_8 {
	public static void main(String[] args) {
		EmailNotification en = new EmailNotification();
		en.send();
		SMSNotification sn = new SMSNotification();
		sn.send();
	}
}
