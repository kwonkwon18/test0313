package algorithm;

import java.util.*;

public class num3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		int cnt = 0;
		boolean b; // i 와 i+1 을 비교하기 위한 변수
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		for (int i = 0; i < arr.length; i++) {
			b = false; // 기본값 false 로 지정
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					b = true;
					break;
				}
			}if(b == false) {
				cnt ++;
			}
		}System.out.println(cnt);
		

	}

}
