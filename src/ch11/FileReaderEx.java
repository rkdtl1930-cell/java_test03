package ch11;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\KBS\\test.txt");
			// "\"가 이스케이프 기능을 해서 "\\"를 쓴다. 아니면 그냥 "/"를 쓴다
			char[] buf = new char[10];
			int c;

			while((c=fin.read(buf))!=-1) {
				System.out.println(c);
				System.out.print(buf);
			}
			System.out.println();
//		} catch (FileNotFoundException e) { // 밑에 catch 문이 상위 이므로 없어도 됨
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close(); // 파일은 매번 마지막에 닫아주는게 좋음
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
