interface PhoneInterface {
	int BUTTONS = 20;
	void sendCall();
	void receiveCall();
}
interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface {
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) { return x + y; }
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	public void sendCall() { System.out.println("Send Call"); }
	public void receiveCall() { System.out.println("Recevie Call"); }
	public void sendSMS() { System.out.println("Send SMS"); }
	public void receiveSMS() { System.out.println("Receive SMS"); }
	public void play() { System.out.println("Play"); }
	public void stop() { System.out.println("Stop"); }
	public void schedule() { System.out.println("Schedule"); }
}
public class InterfaceEx {
	public static void main(String [] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3,5));
		p.schedule();
	}
}