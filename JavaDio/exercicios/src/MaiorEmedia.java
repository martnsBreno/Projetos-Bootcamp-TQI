import java.util.Scanner;

public class MaiorEmedia {
    public static void main(String[] args) {
        
        /*criar um progama que lê 5 numeros e informa o maior numero e a media desses numeros */
        Scanner scan3 = new Scanner(System.in);

        int numero;

        int maior = 0;
        int media = 0;

        int index = 0;

        do {

            System.out.println("Numero ");
            numero = scan3.nextInt();
            media += numero;
            if(numero > maior) maior = numero;
            index++;

        } while(index < 5);

        media /= 5;

        System.out.println("A média dos números foi: " + media);
        System.out.println("O maior número informado foi:" + maior);

    }
}
