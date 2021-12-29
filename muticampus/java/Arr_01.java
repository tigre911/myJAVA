import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arr_01 {
	public static void main(String[] args) {
		
		int[] score = {20, 50, 60, 40, 15, 70};
        int max = score[0];
        int min = score[0];
        
        for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				
			}else if (score[i] < min) {
				min = score[i];
			}
		}

        System.out.println("max : " + max);
        System.out.println("min : " + min);
        
       int[] lotto =new int[6];
       Random random = new Random();
       Scanner sc = new Scanner(System.in);
       System.out.println("자동 몇개 드릴까?");
       int num = sc.nextInt();
       
       for (int j = 0; j < num; j++) {
    	   for (int i = 0; i < lotto.length; i++) {
        	   int n = random.nextInt(45) + 1;
        	   lotto[i] = n; 
           }
    	   Arrays.sort(lotto);
    	   System.out.println("이번주 예상 번호 : " + Arrays.toString(lotto));
       }
       
       
       
	}
}
