package ch07;

class AA{
	public void fun1() {
		System.out.println("AA의 fun1");
	}
	public void fun2() {
		System.out.println("AA의 fun2");
	}
}

class BB extends AA{ // class 앞에 final을 붙이면 클래스 상속을 못함
	public void fun1() { // method 앞에 final을 붙이면 메소드 오버라이딩을 못함
		System.out.println("BB의 fun1");
	}
	public void fun2() {
		System.out.println("BB의 fun2");
	}
}

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
