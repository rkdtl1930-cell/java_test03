package ch08;

abstract class Shape{
	int x;
	int y;
	public void paint() {
		System.out.println("그리기");
	}
	public abstract void draw();
}
class Line extends Shape{ // 추상 클래스를 상속 받는 일반 클래스는 추상 메소드를 반드시 구현해야 한다

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
class Rect extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
abstract class Abc{
	public void fun1() {
		System.out.println("Abc");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Shape s1 = new Shape(); // 추상 클래스는 불러올 수 없음
		Abc abc = new Abc(); // 추상 클래스는 객체를 만들 수 없음 */
		Shape s1 = new Line();
		Shape s2 = new Rect();
		s1.paint();
		s1.draw();
		s2.paint();
		s2.draw();
	}

}
