import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenaçaoSet {
    public static void main(String[] args) {
        System.out.println(" - Ordem aleatoria -");
        Set<Serie> minhaSeries = new HashSet<>() {{

            add(new Serie("the office", "comedia", 60));
            add(new Serie("peaky blinders", "drama", 45));
            add(new Serie("sons of anarchy", "acao/drama", 50));

        }};

        for (Serie serie : minhaSeries) System.out.println(serie.getNome() + " / " + serie.getGenero() + " / " + serie.getTempoEp());

        System.out.println(" - Ordem de inserção - ");
        Set<Serie> minhaSeries1 = new LinkedHashSet<>() {{

            add(new Serie("the office", "comedia", 60));
            add(new Serie("peaky blinders", "drama", 60));
            add(new Serie("sons of anarchy", "acao/drama", 50));

        }};

        for (Serie serie : minhaSeries1) System.out.println(serie.getNome() + " / " + serie.getGenero() + " / " + serie.getTempoEp());

        System.out.println(" - Ordem Natural por tempo de episódio - ");
        Set<Serie> minhaSeries2 = new TreeSet<>(minhaSeries1);
        for (Serie serie : minhaSeries2) System.out.println(serie.getNome() + " / " + serie.getGenero() + " / " + serie.getTempoEp());

        System.out.println(" - Ordem por tempo/genero/TempoEpisodio");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEp());
        minhaSeries3.addAll(minhaSeries);
        for (Serie serie : minhaSeries3) System.out.println(serie.getNome() + " / " + serie.getGenero() + " / " + serie.getTempoEp());

    }
}



class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempoEp;
    
    public Serie(String nome, String genero, Integer tempoEp) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEp = tempoEp;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEp() {
        return tempoEp;
    }

    @Override
    public String toString() {
        return "[genero=" + genero + ", nome=" + nome + ", tempoEp=" + tempoEp + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tempoEp == null) ? 0 : tempoEp.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tempoEp == null) {
            if (other.tempoEp != null)
                return false;
        } else if (!tempoEp.equals(other.tempoEp))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie o) {
        // TODO Auto-generated method stub
        int tempoEpisodio = Integer.compare(this.getTempoEp(), o.getTempoEp());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(o.getGenero());
    }

}

class ComparatorNomeGeneroTempoEp implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        // TODO Auto-generated method stub
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(o1.getTempoEp(), o2.getTempoEp());
    }

}