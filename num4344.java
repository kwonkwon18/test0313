package algorithm;

import java.util.Scanner;

public class num4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int arr[];

		for (int i = 0; i < c; i++) { // 테스트 갯수만큼 돌림
			int students = sc.nextInt();
			arr = new int[students]; // 제일 바깥쪽의 for 문에 선언해줘야함. 제일 큰 지역변수
			double sum = 0;

			for (int j = 0; j < students; j++) {

				int grade = sc.nextInt();
				arr[j] = grade;
				sum += grade;
			}

			double count = 0;
			double mean = (sum / students);

			for (int j = 0; j < students; j++) {
				if (arr[j] > mean) {
					count++;
				}

			}
			System.out.printf("%.3f%%%n", (count / students) * 100);
		}

	}
}
