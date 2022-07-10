public class Mensagem {
    
    public static void grettings(int hora) {
        if(hora <= 12) {
            System.out.println("Bom dia");
        } else if (hora <= 18) {
            System.out.println("Boa tarde");
        } else {
            System.err.println("Boa noite");
        }
    }

}
