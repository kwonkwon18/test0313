package algorithm;

public class gugudan2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println("    " + i + "*" + j + " = " + i * j + "    " + (i + 3) + "*" + j + " = "
						+ (i + 3) * j + "    " + (i + 6) + "*" + j + " = " + (i + 6) * j);
			System.out.println();
		}

	}

}
