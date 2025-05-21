package fundamentoJava;

import java.util.Scanner;

public class AtividadeConversãoTipo {
	public static void main(String []args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o valor do primeiro salario: ");
	String n1 = entrada.nextLine();
	
	System.out.println("Digite o valor do segundo salario: ");
	String n2 = entrada.nextLine();
	
	System.out.println("Diigte o valor do terceiro salario: ");
	String n3 = entrada.nextLine();
	
	n1 = n1.replace(",",".");
	n2 = n2.replace(",",".");
	n3 = n3.replace(",",".");
	
	Double Salario1 = Double.parseDouble(n1);
	Double Salario2 = Double.parseDouble(n2);
	Double Salario3 = Double.parseDouble(n3);
	
	Double Média = (Salario1 + Salario2 + Salario3) / 3;
	
	System.out.println("Você recebeu os seguintes salarios: \n1° Pagamento: "+String.format("R$ %.2f", Salario1)+"\n2°Pagamento: "+String.format("R$ %.2f", Salario2)+""
			+ "\n3°Pagamento: "+String.format("R$ %.2f", Salario3));
	System.out.println("A média Salarial é de: "+String.format("R$ %.2f;",Média));
	
	}
}
