import java.util.Scanner;
public class condiçoes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1 = readNota1(sc);
        float nota2= readNota2(sc);

        float calcular = resultado(nota1, nota2);

        String resultadoFinal = result(calcular);

        System.out.println(" Sua nota foi: "+calcular+" e você foi "+resultadoFinal);
        
        sc.close();
    }

    public static float readNota1(Scanner sc){
        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        return nota1;
    }

    public static float readNota2(Scanner sc){
        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        return nota2;
    }

    public static float resultado(float nota1, float nota2){
    return (nota1 + nota2) / 2;
}
public static String result (float calcular){
    if (calcular >= 6.1){
        return "Aprovado";
        }
        else if (calcular <6.1){
            return "Reprovado";
        }
        else{
            return "Nota invalida";
        }
    }
}