import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
    
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe apenas números.");
                //e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, não é possível dividir esses números..");
                //e.printStackTrace();
            }
             finally {
                System.out.println("Saiu aqui finally");
            }
        } while (continueLooping == true);
    }

public static int dividir(int a, int b) {
    return a / b;
}

}
