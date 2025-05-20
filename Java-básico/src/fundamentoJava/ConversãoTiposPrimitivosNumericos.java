package fundamentoJava;

import javax.swing.JOptionPane;

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
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 2000;
		System.out.println(Integer.toString(num2).length());
	

		String valor1 = JOptionPane.showInputDialog("Digite um numero: ");
		String valor2 = JOptionPane.showInputDialog("Digite outro numero: ");
		
		Double n1 = Double.parseDouble(valor1);
		Double n2 = Double.parseDouble(valor2);
		
		Double soma = n1 + n2;
		System.out.println("A soma dos dois valores é: "+ soma);
	}
}
