import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import javax.sql.rowset.Predicate;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprimindo todos os elementos dessa lista de String: ");

        // numerosAleatorios.stream().forEach(s -> System.out.println(s));

        /* é a mesma coisa de :  */
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um set");

        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

//        System.out.println("Transforme essa lista em uma lista de números inteiros: ");
//        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(collectList);
            

//      System.out.println("Pegando os números pares e maiores que 2 e colocando em uma lista: ");
//
//      List<Integer> listParametrosMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
//      System.out.println(listParametrosMaioresQue2);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(media -> System.out.println(media));

        System.out.println("Removendo os números impares: ");
        /* TRANSFORMANDO A LISTA DE STRING EM LISTA DE INTEGERS PARA PODERMOS REALIZAR O EXERCICIO */
        List<Integer> numerosAleatorios10 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatorios10.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatorios10);


            
        }
            
        }

        

