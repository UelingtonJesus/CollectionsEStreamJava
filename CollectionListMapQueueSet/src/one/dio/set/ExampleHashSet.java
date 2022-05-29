package one.dio.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {

    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10d);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4d);

        System.out.println(notasAlunos);

        System.out.println("\nRemove a nota");
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        System.out.println("\nQuanidade de itens");
        System.out.println(notasAlunos.size());

        System.out.println("\nNavega com iterator");
        Iterator<Double> iterator = notasAlunos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nNavega com foreach");
        for (Double nota:notasAlunos
             ) {
            System.out.println(nota);
        }

        notasAlunos.clear();

        System.out.println("\nVerifica se a lista está vazia");
        System.out.println(notasAlunos.isEmpty());




    }

}
