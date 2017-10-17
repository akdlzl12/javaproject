package example3;

public class Quizz4 {
	
	static String[] arr1 = {"", "십", "백", "천"};
	static String[] arr2 = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
	
	public static void permutation(String str) {
		
		int strCount = str.length()-1;
		String[] arr3 = new String[str.length()];
		int[] intArr1 = new int[str.length()];
		
		
		for(int a = 0; a < arr3.length; a++) {
			arr3[a] = str.substring(a, a+1);		
		}
		
		for(int b = 0; b < intArr1.length; b++) {
			intArr1[b] = Integer.parseInt(arr3[b]);
			System.out.println(intArr1[b]);
		}
		
		for(int c = 0; c < intArr1.length; c++) {
			
			if(intArr1[c] == 0) {
				continue;
				
			}else {
				if(intArr1[c] == 1) {
					if(c == intArr1.length-1 && intArr1[intArr1.length-1] == 1){
						System.out.print(arr2[1]);
					}
					System.out.print(arr1[intArr1.length-1-c]);
				}else {
					System.out.print(arr2[intArr1[c]]);
					System.out.print(arr1[intArr1.length-1-c]);
				}
				
			}
			
			
			/*if(intArr1[c] == 1) {
				
				System.out.print(arr1[strCount]);
				strCount--;
				
			}else {
				System.out.print(arr2[intArr1[c]] + arr1[strCount]);
				strCount--;
			}
			
			if(c == intArr1.length-1 && intArr1[intArr1.length-1] == 1) {
				System.out.print(arr2[1]);
				
			}*/
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		permutation("0111");
	}
}
