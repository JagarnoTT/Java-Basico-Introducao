package fundamentoJava;

public class ConversãoTiposPrimitivosNumericos {
	public static void main(String [] args) {
		
		float a = (float) 1.0; // Neste formato estou declarando para a maquina que este valor é do tipo primitivo float;
		
		float b = 1.00F;
		
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 5.9; // O propósito da atividade é transformar um valor com pont flutuante em um valor inteiro truncando ele, arredondando ele sempre para a primeira casa decimal;
		int f = (int) e;
		System.out.println(f);
	}

}
