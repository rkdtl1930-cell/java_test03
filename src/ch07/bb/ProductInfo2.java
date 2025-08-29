package ch07.bb;

import java.util.*;

public class ProductInfo2 {
	
	static Scanner sc;
	
	static HashMap<Integer, Product> map;
	
	static int cnt=0;
	
	static void input(Product[] p) {
		while(true) {
			System.out.print("상품의 종류선택 : 1 책 | 2 앨범 | 3 회화책 | 4 이전으로 >>");
			int num = sc.nextInt();
			if(num == 4) {
				System.out.println("이전으로 돌아갑니다");
				break;
			}
			switch(num) {
			case 1 :
				System.out.print("상품설명>>");
				sc.nextLine();
				String comment = sc.nextLine();
				System.out.print("생산자>>");
				String productor = sc.next();
				System.out.print("가격>>");
				int price = sc.nextInt();
				System.out.print("책제목>>");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("저자>>");
				String author = sc.nextLine();
				map.put(++cnt, new Book(cnt, comment, productor, price, title, author));
				
				break;
			case 2 :
				System.out.print("상품설명>>");
				sc.nextLine();
				comment = sc.nextLine();
				System.out.print("생산자>>");
				productor = sc.next();
				System.out.print("가격>>");
				price = sc.nextInt();
				System.out.print("앨범제목>>");
				sc.nextLine();
				String albumTitle = sc.nextLine();
				System.out.print("가수>>");
				String singer = sc.nextLine();
				map.put(++cnt, new CompactDisc(cnt, comment, productor, price, albumTitle, singer));
				break;
			case 3 :
				System.out.print("상품설명>>");
				sc.nextLine();
				comment = sc.nextLine();
				System.out.print("생산자>>");
				productor = sc.next();
				System.out.print("가격>>");
				price = sc.nextInt();
				System.out.print("책제목>>");
				sc.nextLine();
				title = sc.nextLine();
				System.out.print("저자>>");
				author = sc.nextLine();
				System.out.print("언어>>");
				String language = sc.next();
				map.put(++cnt , new ConversationBook(cnt, comment, productor, price, title, author, language));
				break;
			default :
				System.out.println("입력 오류");
			}
		}
	}
	
	static void search(Product[] p) {
		while(true) {
			System.out.print("상품 아이디 입력(0을 입력하면 종료됩니다)>>");
			int id = sc.nextInt();
			if(id == 0) {
				break;
			}
			boolean flag = map.containsKey(id);
			if(flag) {
				map.get(id).display();
				System.out.println();
			}
			else {
				System.out.println("찾는 데이터가 없습니다.");
			}
		}
		System.out.println("검색을 종료합니다.");

	}
	
	static void allShow(Product[] p) {
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer id = it.next();
			map.get(id).display();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		map = new HashMap<>();
		Product[] products = new Product[10];
		boolean flag = false;
		while(true) {
			System.out.println("1 상품추가 | 2 상품조회 | 3 모든 상품조회 | 4 끝내기");
			System.out.print("선택>>");
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				input(products);
				break;
			case 2 :
				search(products);
				break;
			case 3 :
				allShow(products);
				break;
			case 4 :
				flag = true;
				break;
			default :
				System.out.println("입력 오류");
			}
			if(flag)
				break;
		}
		System.out.println("프로그램 종료");
	}

}
