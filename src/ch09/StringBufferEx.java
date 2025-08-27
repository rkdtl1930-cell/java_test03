package ch09;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append(" is pecil.");
		System.out.println(sb.hashCode());
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.insert(7, " my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		sb.append("StringBuffer 용량크기 변경");
		System.out.println(sb.capacity());
		
	}

}
