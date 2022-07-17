import javax.swing.JOptionPane;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

            try {

                if(numerador[i] % 2 != 0) throw new Customexcept("Impossivel dividir", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (Customexcept e) {

                e.printStackTrace();
                System.out.println("A divisão não pode ser realizada");

            }

        }

        System.out.println("Continuando...");

    }
}


