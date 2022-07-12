import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Criando uma lista e a adicionando sete notas:");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5d);
        notas.add(9.3d);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6d);
        System.out.println(notas);

        System.out.println("Exibindo a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicionando na lista a nota 10.0 na posição 4: ");
        notas.add(4, 10d);
        System.out.println("Exibindo a lista com a nota 10 na posição 4:" + notas);

        System.out.println("Substituindo a nota 5 pela nota 6:");
        notas.set(3, 6d);
        System.out.println("Exibindo o array com a mudança:" + notas);

        System.out.println("Conferindo pra ver se a nota 5 está na lista " + notas.contains(5d));

        //System.out.println("Usando for para exibir todos os itens na nossa lista: ");
        //for (Double double1 : notas) System.out.println(double1);

        System.out.println("Exibindo a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exibindo a menor nota : " + Collections.min(notas));
        System.out.println("Exibindo a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }       
        System.out.println("Exibindo a soma dos valores: " + soma);

        System.out.println("Exibindo a media dos valores:" + (soma/notas.size()));

        System.out.println("Removendo a nota 0: ");
        notas.remove(0d);

        System.out.println("Removendo as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista: ");
        notas.clear();

        System.out.println(notas);

        System.out.println("Conferindo se a lista está vazia: " + notas.isEmpty());
    }
}
