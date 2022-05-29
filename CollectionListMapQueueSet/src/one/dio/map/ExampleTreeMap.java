package one.dio.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Santa Catarina");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Minas Gerais");

        System.out.println("\nExibe todas as capitais");
        System.out.println(treeCapitais);

        System.out.println("\nRetona a primeira capital no topo da árvore");
        System.out.println(treeCapitais.firstKey());

        System.out.println("\nRetona a última capital no topo da árvore");
        System.out.println(treeCapitais.lastKey());

        System.out.println("\nRetona a primeira capital abaixo na árvore da capital parametrizada");
        System.out.println(treeCapitais.lowerKey("SC"));

        System.out.println("\nRetona a primeira capital acima na árvore da capital parametrizada");
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.println("\nExibe todas as capitais");
        System.out.println(treeCapitais);

        System.out.println("\nRetona a primeira capital no topo da árvore");
        System.out.println(treeCapitais.firstEntry().getKey()+"-"+treeCapitais.lastEntry().getValue());

        System.out.println("\nRetona a última capital no topo da árvore");
        System.out.println(treeCapitais.lastEntry().getKey()+"-"+treeCapitais.lastEntry().getValue());

        System.out.println("\nRetona a primeira capital abaixo na árvore da capital parametrizada");
        System.out.println(treeCapitais.lowerEntry("SC").getKey()+"-"+treeCapitais.lowerEntry("SC").getValue());

        System.out.println("\nRetona a primeira capital acima na árvore da capital parametrizada");
        System.out.println(treeCapitais.higherEntry("SC").getKey()+"-"+treeCapitais.higherEntry("SC").getValue());

        System.out.println("\nExibe todas as capitais");
        System.out.println(treeCapitais);

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println("\nRetona a primeira capital no topo da árvore, removendo do map");
        System.out.println(firstEntry.getKey()+"-"+firstEntry.getValue());

        System.out.println("\nRetona a última capital no topo da árvore, removendo do map");
        System.out.println(lastEntry.getKey()+"-"+lastEntry.getValue());

        System.out.println("\nExibe todas as capitais");
        System.out.println(treeCapitais);

        System.out.println("\nNavega usando o iterator");
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            String key = iterator.next();
            System.out.println(key+" -- "+ treeCapitais.get(key));
        }

        for (String capital:treeCapitais.keySet()
             ) {
            System.out.println(capital+" ---- "+ treeCapitais.get(capital));
        }

        for (Map.Entry<String, String>capital: treeCapitais.entrySet()
             ) {
            System.out.println(capital.getKey()+" ------ "+ capital.getValue());
        }


    }
}
