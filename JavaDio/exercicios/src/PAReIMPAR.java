import java.util.Scanner;

public class PAReIMPAR {
    public static void main(String[] args) {
        
        /*CRIE UM PROGAMA QUE PEÇA N NUMEROS INTEIROS, CALCULE E MOSTRE A QUANTIDADE DE NÚMEROS PARES E A QUANTIDADE DE NÚMEROS IMPARES. */
        Scanner scan4 = new Scanner(System.in);

        int qtdnumero;
        int numero2;

        int index = 0;

        int pares = 0;
        int impares = 0;

        System.out.println("Quantos números deseja adicionar? ");
        qtdnumero = scan4.nextInt();

        while (index < qtdnumero) {

            System.out.println("Digite um número ");
            numero2 = scan4.nextInt();
            index++;

            if(numero2 % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);

    }
}
