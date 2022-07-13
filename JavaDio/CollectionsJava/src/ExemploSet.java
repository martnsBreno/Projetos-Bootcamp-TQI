import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        
        System.out.println("Criando um conjunto e adicionando notas : ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        /* Implementando o método SET, diferente do ArrayList não podemos acessar a posição dos valores dentro do set, então utilizando esse método não é possível realizar operações como exibir a posição de tal nota, nem adicionar tal nota em seguinte posição e nem substituir um valor já dentro do set por outro. */

        System.out.println("Confira se a nota 5.0 está no conjunto:  " + notas.contains(5d));

        System.out.println("Exibindo a menor nota " + Collections.min(notas));

        System.out.println("Exibindo a maior nota " + Collections.max(notas));

        System.out.println("Exibindo a soma dos valores dentro do metodo: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(Math.floor(soma));


        System.out.println("Exibindo a média: " + Math.floor(soma/notas.size()));

        System.out.println("Removando a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo notas menores que 7: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double next2 = iterator2.next();
            if (next2 < 7) iterator2.remove();
        }

        System.out.println(notas);

        System.out.println("Usando LinkedHashSet para informar a ordem em que foram adicionadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(10d);
        notas2.add(3d);
        notas2.add(3.6d);
        notas2.add(8.7d);
        notas2.add(10d);
        System.out.println(notas2);

        System.out.println("Usando TreeSet para exibir as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagando todos os conjuntos");
        notas.clear();

        /*PODERIA USAR isEmpty() para verificar se está realmente vazio. */
    }
}
