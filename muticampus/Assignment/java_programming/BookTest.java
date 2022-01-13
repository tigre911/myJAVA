package pr01;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("도서번호" +"\t"+ "도서명" +"\t"+"\t"+ "저자" +"\t"+ "가격" +"\t"+ "발행일" +"\t"+ "출판사");
		System.out.println("--------------------------------------------------------");
		Book bk1 = new Book();
		bk1.bookNo = "B001";
		bk1.bookTitle = "자바프로그래밍";
		bk1.bookAuthor = "홍길동";
		bk1.bookPrice = 25000;
		bk1.bookYear = 2021;
		bk1.bookPublisher = "멀티출판사";
		System.out.println(bk1.toString());
		
		Book bk2 = new Book();
		bk2.bookNo = "B002";
		bk2.bookTitle = "자바스크립트";
		bk2.bookAuthor = "이몽룡";
		bk2.bookPrice = 30000;
		bk2.bookYear = 2020;
		bk2.bookPublisher = "서울출판사";
		System.out.println(bk2.toString());
		
		Book bk3 = new Book();
		bk3.bookNo = "B003";
		bk3.bookTitle = "HTML/CSS";
		bk3.bookAuthor = "성춘향";
		bk3.bookPrice = 18000;
		bk3.bookYear = 2021;
		bk3.bookPublisher = "강남출판사";
		System.out.println(bk3.toString());
		
		System.out.println("잡지번호" +"\t"+ "잡지명" +"\t"+ "저자" +"\t"+ "가격" +"\t"+ "발행일" +"\t"+ "출판사" + "\t" + "발행월");
		System.out.println("--------------------------------------------------------");
		Magazine m1 = new Magazine();
		m1.setM("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
		System.out.println(m1.toString());
		Magazine m2 = new Magazine();
		m2.setM("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
		System.out.println(m2.toString());
		Magazine m3 = new Magazine();
		m3.setM("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);
		System.out.println(m3.toString());
	}

}

class Book{
	String bookNo;
	String bookTitle;
	String bookAuthor;
	int bookYear;
	int bookPrice;
	String bookPublisher;
	public String toString() {
		return (bookNo +"\t"+ bookTitle +"\t"+ bookAuthor +"\t"+ bookYear +"\t"+ bookPrice +"\t"+ bookPublisher);
	}	
}

class Magazine extends Book{
	int month;
	
	public void setM(String bookNo,	String bookTitle, String bookAuthor,int bookPrice,int bookYear,String bookPublisher, int month) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
		this.month = month;
	}
	
	@Override
	public String toString() {
		return super.toString() +"\t"+ month;
	}
}