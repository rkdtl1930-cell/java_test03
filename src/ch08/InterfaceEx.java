package ch08;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉따르릉~~");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자 왔어요.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		PhoneInterface phone2 = new SamsungPhone();
		phone2.printLogo();
		phone2.sendCall();
		phone2.receiveCall();
//		phone2.flash();
		
		SmartPhone phone3 = new SmartPhone();
		phone3.printLogo();
		phone3.sendCall();
		phone3.play();
		System.out.println("3과 5를 더하면 "+phone3.calculate(3, 5));
		phone3.schedule();
	}

}
