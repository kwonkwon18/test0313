package algorithm;

public class gugudan3 {

	public static void main(String[] args) {
		for(int i = 9 ; i >= 7 ; i--) {
			for(int j = 1 ; j <= 9 ; j++)
				if(i == 9) {
				System.out.println("    " + i + "*" + j + " = " + i*j + "    " + "    " + (i-5) + "*" + j + " = " + (i-5)*j + "    " + (i-6) + "*" + j + " = " + (i-6)*j);

				}else if(i == 8) {
					System.out.println("    " + i + "*" + j + " = " + i*j + "    " + "    " + (i-3) + "*" + j + " = " + (i-3)*j + "    " + (i-6) + "*" + j + " = " + (i-6)*j);

				}else{
					System.out.println("    " + i + "*" + j + " = " + i*j + "    " + "    " + (i-1) + "*" + j + " = " + (i-1)*j + "    " + (i-6) + "*" + j + " = " + (i-6)*j);

				}
				System.out.println();
		}

	}

}