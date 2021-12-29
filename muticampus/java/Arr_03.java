import java.util.Arrays;

public class Arr_03 {
	public static void main(String[] args) {

//		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };
//
//		int minIndex = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			minIndex = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[minIndex] > arr[j]) {
//					minIndex = j;
//				}
//				int temp = arr[i];
//				arr[i] = arr[minIndex];
//				arr[minIndex] = temp;
////				System.out.println("temp : " + temp);
//			}
//
//		}
//		System.out.println(Arrays.toString(arr));

		int[] arr0 = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		int tmp;
		for (int i = 0; i < arr0.length; i++) {
			int minIndex0 = i;
			for (int j = i + 1; j < arr0.length; j++) {
				if (arr0[minIndex0] > arr0[j]) {
					minIndex0 = j;
				}
			}
			tmp = arr0[i];
			arr0[i] = arr0[minIndex0];
			arr0[minIndex0] = tmp;
		}
		System.out.println(Arrays.toString(arr0));

	}
}
