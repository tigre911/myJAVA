
public class gridi {
	public static void main(String[] args) {

		int money = 2860;
		int[] coin = new int[] { 500, 100, 50, 10 };

		int count = 0;

		for (int i = 0; i < coin.length; i++) {
			System.out.println("현재돈 : " + money);
			System.out.println("얼마짜리로 거슬러 줄지 : " + coin[i]);
			
			count += money / coin[i]; // 낸돈에서 500원짜리부터 나눈 몫을 count에 더해줌
			money %= coin[i]; // 낸돈에서 500짜리부터 나눈 나머지를 다시 money에 할당
			
			System.out.println("현재 받은 동전 개수 : " + count);
			System.out.println("*****************************");
		}

		System.out.println("거슬러줄 동전 개수 : " + count);

	}
}

