package pr01;

public class ProductTest {
	public static void main(String[] args) {
		Product pd =new Product();
		System.out.println("상품번호" +"\t" + "상품명" +"\t" + "가격" +"\t" + "연도" +"\t" + "제조사");
		System.out.println("-------------------------------------");
		pd.toString(001, "노트북", 1200000, 2021, "삼성");
		pd.toString(002, "모니터", 300000, 2021, "LG");
		pd.toString(003, "마우스", 30000, 2020, "로지텍");
		
	}	
}

class Product{
	int prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	void toString(int a, String b, int c, int d, String e) {
		System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
	}
}