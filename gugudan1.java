package algorithm;

public class gugudan1 {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 7 ; i += 3) {
			
			for(int j = 1 ; j <= 9 ; j++)
				System.out.println("    " + i + "*" + j + " = " + i*j + "    " + (i+1) + "*" + j + " = " + (i+1)*j + "    " + (i+2) + "*" + j + " = " + (i+2)*j );
			System.out.println();
	}

}
}