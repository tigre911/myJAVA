
public class Note_Class {
	public static void main(String[] args) {

		int[] arr = { 100, 88, 100, 100, 90 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println((float)sum/arr.length);
	}
}
