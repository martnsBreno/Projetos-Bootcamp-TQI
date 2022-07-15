import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenaçãoMap {
    public static void main(String[] args) {
        
        System.out.println("Ordem Aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Stephen Hawking", new Livro("Uma breve história do tempo", 256));
            put("Charles Duhigg", new Livro("O poder do hábito", 408));
            put("Eiichiro Oda", new Livro("One Piece", 7000));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println("Autor: " + livro.getKey() + " Nome: " + livro.getValue().getNome());
        } 

        System.out.println("Ordem de inserção> ");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Stephen Hawking", new Livro("Uma breve história do tempo", 256));
            put("Charles Duhigg", new Livro("O poder do hábito", 408));
            put("Eiichiro Oda", new Livro("One Piece", 7000));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println("Autor: " + livro.getKey() + " Nome: " + livro.getValue().getNome());
        }
        
        System.out.println("Ordem Alfabetica Autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println("Autor: " + livro.getKey() + " Nome: " + livro.getValue().getNome());
        } 

        System.out.println("Ordem alfabetica nome dos livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros1.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println("Autor: " + livro.getKey() + " Nome: " + livro.getValue().getNome());
        } 

    }
}
class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }


    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }


}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        // TODO Auto-generated method stub
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}