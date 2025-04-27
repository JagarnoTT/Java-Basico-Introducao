public class contaSaldo {
    //variavel declarada no escopo da classe
    double saldo = 70.0;
    
public void sacar (double valor){
    //variavel local, esta só está disponivel dentro do método
    double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        System.out.println(saldo);
        //Disponivel em toda a classe
        //System.out.println(novoSaldo);
        //somente o método sacar conhece essa classe
    }
}