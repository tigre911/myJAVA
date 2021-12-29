
public class Arr_02 {
	public static void main(String[] args) {
//		int arr[] = { 75, 100, 85, 60, 95 };
//		int rank=0;
//
//		for (int i = 0; i <= (arr.length) - 1; i++) {
//			
//			int j = arr[i + 1];
//			for (int j2 = 0; j2 < arr.length; j2++) {
//				
//			}
//			
//			}
//			
//		}

		int[] score = new int[]{75,100,85,60,95};
        int ranking = 1;
        for(int i=0;i<score.length;i++){
            for(int j=0; j<score.length;j++){
                if(score[i] < score[j]){
                ranking += 1;
                }
            }
            System.out.println(score[i]+" "+ranking+"등");
            
            
        }
        
    }
}


