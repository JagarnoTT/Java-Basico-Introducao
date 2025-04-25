public class Usuario {
    
    public static void main(String[] args) {
        metodosSmartTV metodosSmartTV = new metodosSmartTV();

        System.out.println("A TV está ligada? " + metodosSmartTV.ligada);
        System.out.println("A TV está em qual canal? " + metodosSmartTV.canal);
        System.out.println(" TV está em qual volume? " + metodosSmartTV.volume);

        metodosSmartTV.ligar ();{
            System.out.println("A TV está ligada? " + metodosSmartTV.ligada);
        
            metodosSmartTV.desligar();
            System.out.println("A TV está desligada? " + metodosSmartTV.ligada);
        }

        metodosSmartTV.aumentarVolume();
        metodosSmartTV.aumentarVolume();
        metodosSmartTV.aumentarVolume();
        metodosSmartTV.aumentarVolume(); 
        {
            System.out.println("O volume da SmartTv agora está em " + metodosSmartTV.volume);

            metodosSmartTV.diminuirVolume();
            metodosSmartTV.diminuirVolume();
            metodosSmartTV.diminuirVolume();
            {
                System.out.println("O volume da SmartTv agora está em " + metodosSmartTV.volume);
            }
        }

        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();
        metodosSmartTV.aumentarCanal();{
            System.out.println("Agora você está no canal " + metodosSmartTV.canal);
        }
        metodosSmartTV.diminuirCanal();
        metodosSmartTV.diminuirCanal();
        metodosSmartTV.diminuirCanal();
        metodosSmartTV.diminuirCanal();{
            System.out.println("Agora você está no canal " + metodosSmartTV.canal);
        }
        metodosSmartTV.mudarCanal(14);{
            System.out.println("Agora seu canal é " + metodosSmartTV.canal);
        };
    }
}
