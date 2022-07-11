import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /*CRIAR UM GERADOR DE TABUADA */
        Scanner scan5 = new Scanner(System.in);
        int resultado;

        System.out.println("Tabuada de: ");
        int tabuada = scan5.nextInt();

        System.out.println("Aqui está a tabuada: ");
        System.out.println("Tabuada de: " + tabuada);
        
        for(int i = 0; i < 10; i++) {

            System.out.println(tabuada + " X " + i + " = " + tabuada * i );
        }
    }
}
