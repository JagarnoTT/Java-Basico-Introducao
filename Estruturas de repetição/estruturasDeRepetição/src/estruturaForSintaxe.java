public class estruturaForSintaxe {
    public static void main(String[] args) {
        String alunos [] = { "João", "Maria", "Pedro", "Ana", "Carlos" };
        // Em arrays o indice começa em 0 já que o mesmo deve pegar o primeiro elemento
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O Aluno x é: "+ alunos[x]);
        }
    }
    
}
