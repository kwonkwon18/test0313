package algorithm;
import java.util.*;
public class num2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1 ; i <= a ; i++){// 세로 먼저 채워준다는 생각
			for(int j = 1 ; j <= i ; j++) 
				System.out.print("*");
				System.out.println();
			}
	}
	}
