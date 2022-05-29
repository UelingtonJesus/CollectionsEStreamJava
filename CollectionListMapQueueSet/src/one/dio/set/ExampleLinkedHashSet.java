package one.dio.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        System.out.println("\nRemove um número ");
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        System.out.println("\nQuanidade de itens");
        System.out.println(sequenciaNumerica.size());

        System.out.println("\nNavega com iterator");
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nNavega com foreach");
        for (Integer numero:sequenciaNumerica
             ) {
            System.out.println(numero);
        }

        System.out.println("\nVerifica se a lista está vazia");
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
