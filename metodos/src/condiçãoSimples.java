public class condiçãoSimples {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado, sua nota foi: " + nota: nota >= 5 && nota <7 ? "Recuperação, sua nota foi: "+nota : "Reprovado, sua nota foi: "+nota;
        System.out.println(resultado);
    }
}
