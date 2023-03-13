package algorithm;

import java.util.*;

public class num2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		int index = 0;
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i + 1;
			}
		}
		System.out.print(index);
	}
}