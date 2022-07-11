import java.util.Scanner;

public class NomeEidade {
    public static void main(String[] args) throws Exception {

        /*CRIAR UM PROGAMA QUE PEÇA NOME E IDADE PARA O USUARIO, O PROGAMA DEVE CONTINUAR EXECUTANDO ATÉ O USUARIO INFORMAR O VALOR "0" */

        String nome;
        int idade;

        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Saindo do laço de repetição");

}
}