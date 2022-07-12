import java.util.Random;

public class Ex3NumerosAleatorios {
    public static void main(String[] args) {
        /*FAÇA UM PROGAMA QUE LEIA 20 NUMEROS DE 1 A 100 E ARMAZENE-OS EM UM VETOR
         AO FINAL MOSTRE OS NÚMEROS E SEUS SUCESSORES.
        */
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for(int i = 0; i < randomNumbers.length; i++) {
            int numero = random.nextInt(100);
            randomNumbers[i] = numero;
        }
        System.out.println("Números Aleatorios: ");
        for (int numero : randomNumbers) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessor do número: ");
        for (int numero : randomNumbers) {
            System.out.println((numero+1) + " ");
        }

    }
}
