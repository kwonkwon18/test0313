package algorithm;

import java.util.Scanner;

public class num10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String arr[][] = new String[5][];
		
		for(int i = 0 ; i < 5 ; i++) {
			arr[i] = sc.nextLine().split("");
		}
		
		int max = 0;
		for(int i = 0 ; i < 5 ; i++) {
			if(max < arr[i].length) {
				max = arr[i].length;
			}
		}
		
		for(int i = 0 ; i < max ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(i < arr[j].length); // 열을 담당하는 i 가 해당 문자열의 길이를 넘지 못하게..!
				System.out.print(arr[j][i]);
					
			}
		}

	}

}
