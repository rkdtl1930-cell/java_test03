package ch07.aa;

class Person{
	private String name;
	private String address;
	private String tel;
	
	public Person() {}

	public Person(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}

class Customer extends Person{
	private int cno;
	private int mileage;
	public Customer() {}
	
	public Customer(int cno, int mileage, String name, String address, String tel) {
		super(name, address, tel);
		this.cno = cno;
		this.mileage = mileage;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c2 = new Customer(1, 10, "홍길동", "부산진구", "3333-5656");
		Person p2 = c2;
		Customer c3 = (Customer)p2;
		System.out.println(c3.getMileage());
	}

}
