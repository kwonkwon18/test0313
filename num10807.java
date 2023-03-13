package algorithm;
import java.util.*;
public class num10807 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int[] arr = new int[a];
	int count = 0;
	
	for(int i = 0 ; i < a ; i++) {
		arr[i] = sc.nextInt();
	}
	
	int b = sc.nextInt();
	
	for(int j = 0 ; j < arr.length ; j++) {
		if(arr[j] == b) {
			count++;
		}
	}System.out.println(count);
}
}
