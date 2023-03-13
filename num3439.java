package algorithm;

import java.util.*;

public class num3439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i; j++)
				System.out.print(" ");
			
			for (int l = 1; l <= i; l++)
				System.out.print("*");
			System.out.println();
		}
		}

	}
