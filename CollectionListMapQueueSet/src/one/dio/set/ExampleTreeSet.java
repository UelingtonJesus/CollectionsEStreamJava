package one.dio.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("PA");
        treeCapitais.add("Fl");
        treeCapitais.add("CUR");
        treeCapitais.add("SP");
        treeCapitais.add("RJ");
        treeCapitais.add("BH");

        System.out.println(treeCapitais);

        System.out.println("\nRetorna a primeira capital no topo da árvore");
        System.out.println(treeCapitais.first());

        System.out.println("\nRetorna a última capital no topo da árvore");
        System.out.println(treeCapitais.last());

        System.out.println("\nRetorna a primeira capital abaixo na árvore parametrizada");
        System.out.println(treeCapitais.lower("Fl"));

        System.out.println("\nRetorna a primeira capital acima na árvore parametrizada");
        System.out.println(treeCapitais.higher("Fl"));

        System.out.println(treeCapitais);

        System.out.println("\nRetorna a primeira capital no topo da árvore, removendo do set ");
        System.out.println(treeCapitais.pollFirst());

        System.out.println("\nRetorna a primeira capital no final da árvore, removendo do set ");
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        System.out.println("\nNavega com iterator");
        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nNavega com foreach");
        for (String capital:treeCapitais
             ) {
            System.out.println(capital);
        }
    }
}
