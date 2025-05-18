package fundamentoJava;
import java.util.Scanner;

public class conversãoFxC {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Qual seu nome? ");
		String Nome = entrada.nextLine();
		
		System.out.println("Quanto Graus Fahrenheit você deseja converter? ");
		Double Fahrenheit = entrada.nextDouble();
		entrada.nextLine();
		
		Double Celsius = (Fahrenheit - 32) / 1.8;
		
		System.out.println("Seu nome é "+Nome+" e você converteu "+Fahrenheit+"°F em "+ String.format("%.2f",Celsius)+"°C");
		
		entrada.close();
	}
}
