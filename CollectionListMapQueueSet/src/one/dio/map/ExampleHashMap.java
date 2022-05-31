package one.dio.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Agentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        System.out.println("\nAtualiza o valor da chave Brasil");
        campeoesMundialFifa.put("Brasil",6);
        System.out.println(campeoesMundialFifa);

        System.out.println("\nRetorna a Argentina");
        System.out.println(campeoesMundialFifa.get("Argentina"));

        System.out.println("\nRetorna se existe ou não um campeão França");
        System.out.println(campeoesMundialFifa.containsKey("França"));


        System.out.println("\nRemove o campeão França");
        campeoesMundialFifa.remove("França");
        System.out.println(campeoesMundialFifa);

        System.out.println("\nRetorna se existe ou não um campeão França");
        System.out.println(campeoesMundialFifa.containsKey("França"));

        System.out.println("\nRetorna se existe ou não uma seleção hexa campeã");
        System.out.println(campeoesMundialFifa.containsValue(6));

        System.out.println("\nRetorna o tamanho do mapa");
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        System.out.println("\nNavega nos registros do mapa");
        for (Map.Entry<String, Integer>entry: campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        for (String key: campeoesMundialFifa.keySet()
             ) {
            System.out.println(key+"===="+campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        System.out.println("\nRetorna se existe ou não a chave Estados Unidos");
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        System.out.println("\nRetorna se existe ou não o valor 5");
        System.out.println(campeoesMundialFifa.containsValue(5));

        System.out.println("\nRetorna o tamanho antes e depois de limpar o mapa");
        System.out.println(campeoesMundialFifa.size());
        campeoesMundialFifa.clear();
        System.out.println(campeoesMundialFifa.size());



    }
}
