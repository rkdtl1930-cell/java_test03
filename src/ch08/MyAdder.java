package ch08;

interface AdderInterface{
	int add(int x, int y);
	int add(int n);
}

public class MyAdder implements AdderInterface {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int add(int n) {
		// TODO Auto-generated method stub
		int num = 0;
		for(int i = 0 ; i <= n ; i++ )
			num += i;
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}

}
