package algorithm;

import java.util.*;

public class num10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int arr[] = new int[a];
		

		
		for(int i = 0 ; i < a ; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < b) {
			System.out.print(arr[i] + " ");
			}
		}
	}

}
