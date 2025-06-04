package fundamentoJava.fundamentoJava;

public class DesafioBoolean2 {
	public static void main(String[] args ) {
		
		boolean Trabalho1 = true;
		boolean Trabalho2 = false;
		
		boolean ComprarTV50 = Trabalho1 && Trabalho2;
		boolean ComprarTV32 = Trabalho1 || Trabalho2;
		boolean ComprarSorvete = Trabalho1 ^ Trabalho2;
		boolean Dieta = !Trabalho1 && !Trabalho2;
		
		System.out.println("Você pode comprar a TV de 50'? "+ComprarTV50);
		System.out.println("Você pode comprar a TV de 32'? "+ComprarTV32);
		System.out.println("Você pode comprar sorvete? "+ComprarSorvete);
		System.out.println("Você vai fazer dieta? "+Dieta);
	}
		 
	

}
