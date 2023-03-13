package algorithm;
import java.util.*;
public class num1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int copy = N;
		int count = 0;
		
		while(true) {

			int left = (N % 10) * 10;
			int right = ((N%10)+(N/10))%10;
			N = left + right ;
			count++;
			if(N == copy) {
				System.out.println(count);
				break;
			}
			
			
		}
	}

}
