package fundamentoJava;

public class Operadores {
	public static void main(String[]args) {
		int a = 6 * (3 + 2);
		int a2 = a / (3 * 2);
		int a3 = (int) Math.pow(a2, 2);
		
		int b = (1 - 5) * (2 - 7);
		int b2 = b / 2;
		int b3 = (int) Math.pow(b2, 2);
		
		int c = (int) Math.pow(10, 3);
		
		int ab = (b3 - a3);
		int abF = (int) Math.pow(ab, 3);
		double abc = abF / c;
		
		
		System.out.println(abc);
		
	}

}
