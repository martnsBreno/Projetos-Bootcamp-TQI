import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        
        /*CRIAR UM PROGAMA QUE PEÇA UMA NOTA, ENTRE ZERO E DEZ. MOSTRAR UMA MENSAGEM CASO O VALOR SEJA INVÁLIDO E CONTINUAR PEDINDO ATÉ QUE O USUARIO INFORME UM VALOR VÁLIDO. */

        int nota = -1;
        Scanner scan2 = new Scanner(System.in);
    
        while(nota >= 11 || nota <= 0) {
            
            System.out.println("Digite a nota (0 a 10)");
            nota = scan2.nextInt();
            if(nota >=11 || nota <= 0 ) System.out.println("Valor inválido");
        }

        System.out.println("A nota é : " + nota);
    
    }
}
