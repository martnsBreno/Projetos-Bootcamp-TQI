import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        /*  ORDENAR A SEGUINTE LISTA DE ACORDO COM NOME - IDADE - COR */

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 15, "amarelo"));
            add(new Gato("Breno", 20, "branco"));
            add(new Gato("Garfield", 7, "laranja"));
        }};

        System.out.println(" - Ordem de inserção - ");
        System.out.println(meusGatos);

        System.out.println(" - Ordem aleatória - ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println(" - Ordem natural por nome - ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println(" - Ordem por idade - ");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println(" - Ordem por Cor - ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println(" - Ordem por Nome/Cor/Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

/*                          CLASSE GATO                               */


class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "[cor=" + cor + ", idade=" + idade + ", nome=" + nome + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

        /*  COMPARATORS */

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        // TODO Auto-generated method stub
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato a1, Gato a2) {
        // TODO Auto-generated method stub
        return a1.getCor().compareToIgnoreCase(a2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        // TODO Auto-generated method stub
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(o1.getIdade(), o2.getIdade());
    }

}