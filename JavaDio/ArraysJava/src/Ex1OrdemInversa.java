public class Ex1OrdemInversa {
    public static void main(String[] args) {
        /*CRIAR UM VETOR E MOSTRAR O CONTEUDO DELE EM ORDEM INVERSA */

        int[] vetor = {1, 2, 5, 6, 9, 17};

        /*MOSTRANDO O CONTEUDO DO VETOR NA ORDEM NORMAL */

        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        /*MOSTRANDO O CONTEUDO DO VETOR NA ORDEM INVERSA */

        System.out.println("_____________");

        for(int o = (vetor.length - 1); o >= 0; o--) {
            System.out.println(vetor[o]);
        }
    }
}
