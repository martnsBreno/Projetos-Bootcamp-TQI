import java.util.Scanner;

public class Ex2Consoantes {
    public static void main(String[] args) {

        /*CRIAR UM PROGAMA QUE LEIA UM VETOR DE 6 CARACTERES E DIGA QUANTAS CONSOANTES FORAM LIDAS */
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Digite uma letra");
            String letra = scan.nextLine();
            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                qtdConsoantes++;
            }

            count++;
        } while (count < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.println(consoante);
            }
        }

        System.out.println(qtdConsoantes);
    }
}
