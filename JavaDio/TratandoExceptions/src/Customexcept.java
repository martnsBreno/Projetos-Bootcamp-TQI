public class Customexcept extends Exception{
    private int numerador;
    private int denominador;

    public Customexcept(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
}
