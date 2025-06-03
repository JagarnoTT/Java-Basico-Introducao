/*Condições do exercicio*/
/*Uso de boolean*/
/*Usuario deve trabalhar ou terça ou quinta*/
/*Usuario deve comprar 1 TV de 50" se trabalhar os dois dias ou usuario deve comprar 1 TV de 32" se trabalhar apenas 1 dia*/
/*Usuario deve comprar sovete para a familia se trabalhar ao menos 1 dia*/
/*Usuario deve ficar com fome se não trabalhar nenhum dia*/
package fundamentoJava.fundamentoJava;
import java.util.Scanner;

public class DesafioBoolean {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Você trabalhou na terça feira?(Responda com SIM ou NÃO) ".toUpperCase());
		String R1 = entrada.next();
		
		
		System.out.println("VocÊ trabalhou na quinta feira? (Responda com SIM ou NÃO) ".toUpperCase());
		String R2 = entrada.next();
		
		boolean Dia1 = R1.equalsIgnoreCase("SIM");
		boolean Dia2 = R2.equalsIgnoreCase("SIM");
		boolean Não = R1.equalsIgnoreCase("NÃO");
		boolean NÃO = R2.equalsIgnoreCase("NÃO");
		
		if(Dia1 && Dia2) {
			System.out.println("Ótimo podemos comprar a TV de 50' e tomar sorvete");
		}
		
		else if(Dia1 ^ Dia2) {
			System.out.println("Podemos comprar a TV de 32' e tomar sorvete mesmo assim");
		}
		else if (!Não && !NÃO) {
			System.out.println("Como não trabalhou nenhum dia, não teremos nem sorvete e nem TV, vamos ficar com fome");
		}
		else {
			System.out.println("Conteudo digitado é invalido, por favor tente novamente");
		}
		
		entrada.close();
		
	}
}
