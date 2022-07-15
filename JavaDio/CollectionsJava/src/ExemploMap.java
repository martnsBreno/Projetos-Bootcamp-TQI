import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPop = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("civic",18.1);
        }};   
        System.out.println(carrosPop);

        System.out.println("Substituindo o consumo do gol por 15,2km/l");
        carrosPop.put("gol", 15.2);
        System.out.println(carrosPop);

        System.out.println("Conferindo se outro modelo se encontra no map: " + carrosPop.containsKey("saveiro"));

        System.out.println("Exibindo o consumo do uno: " + carrosPop.get("uno"));

        System.out.println("Exibindo os modelos: ");
        Set<String> modelos = carrosPop.keySet();
        System.out.println(modelos);

        System.out.println("Exibindo os consumos: ");
        Collection<Double> consumos = carrosPop.values();
        System.out.println(consumos);

        System.out.println("Exibindo o modelo mais economico");
        /* Para sabermos o modelo mais economico então devemos saber qual o carro que faz mais km/l's */
        Double consumoEficiente = Collections.max(carrosPop.values());
        Set<Map.Entry<String, Double>> entries = carrosPop.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoEficiente);
            }
        }


        System.out.println("Exibindo o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPop.values());
        String modeMenosEficiente = " ";
        for(Map.Entry<String, Double> entry : carrosPop.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: " + modeMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPop.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exibindo a soma dos consumos: " + soma);

        System.out.println("Exibindo a média dos consumos deste dicionário: " + (soma/carrosPop.size()));

        System.out.println("Removando os modelos com o consumo igual a 15.6");
        System.out.println(carrosPop);
        Iterator<Double> iterator1 = carrosPop.values().iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
            };

    }
    System.out.println(carrosPop);

    System.out.println("Exibindo os modelos na ordem em que foram adicionados");
        Map<String, Double> carrosPop1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("civic",18.1);
        }};   
        System.out.println(carrosPop1);

        System.out.println("Exibindo o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPop2 = new TreeMap<>(carrosPop1);
        System.out.println(carrosPop2);

        System.out.println("Apagando o dicionário de carros: ");
        carrosPop.clear();

        System.out.println("Conferindo se o dicionário está vazio: " + carrosPop.isEmpty());
    }
}

