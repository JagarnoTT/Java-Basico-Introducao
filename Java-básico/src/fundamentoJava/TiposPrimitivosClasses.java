package fundamentoJava;

public class TiposPrimitivosClasses {

	public static void main(String[] args) {
		//Tipos em formato de classe
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // Tipo primitivo do integer é INT
		Long l = 100000L; //O L no final deve ser colocado, pois representa a classe Long que no primitivo o "l" de Long é minusculo;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		
	}
}
