import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scanner1.nextInt();

        int mult = 1;
        System.out.println(fatorial + "! = " + mult);
        for(int i = fatorial; i >= 1; i-- ) {
            mult = mult * i;
        }

        System.out.println(mult);
    }
}
