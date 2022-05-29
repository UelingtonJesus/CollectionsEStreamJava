package one.dio.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet {
    public static void main(String[] args) {
        Set<Integer> hashSetNumeros = new HashSet<>();
        hashSetNumeros.add(3);
        hashSetNumeros.add(44);
        hashSetNumeros.add(20);
        hashSetNumeros.add(88);
        hashSetNumeros.add(3);

        TreeSet<Integer> treeSetNumeros = new TreeSet<>();
        treeSetNumeros.add(3);
        treeSetNumeros.add(44);
        treeSetNumeros.add(20);
        treeSetNumeros.add(88);
        treeSetNumeros.add(3);

        LinkedHashSet<Integer> linkedHashSetNumeros = new LinkedHashSet<>();
        linkedHashSetNumeros.add(3);
        linkedHashSetNumeros.add(44);
        linkedHashSetNumeros.add(20);
        linkedHashSetNumeros.add(88);
        linkedHashSetNumeros.add(3);

        System.out.println("\nHashSet: "+hashSetNumeros);
        System.out.println("\nTreeSet: "+treeSetNumeros);
        System.out.println("\nLinkedHashSet: "+linkedHashSetNumeros);

        treeSetNumeros.pollFirst();
        System.out.println("\nTreeSet: "+treeSetNumeros);

        hashSetNumeros.remove(3);
        System.out.println("\nHashSet: "+hashSetNumeros);

        linkedHashSetNumeros.remove(3);
        System.out.println("\nLinkedHashSet: "+linkedHashSetNumeros);

        hashSetNumeros.add(23);
        treeSetNumeros.add(23);
        linkedHashSetNumeros.add(23);

        System.out.println("\nHashSet: "+hashSetNumeros);
        System.out.println("\nTreeSet: "+treeSetNumeros);
        System.out.println("\nLinkedHashSet: "+linkedHashSetNumeros);

        System.out.println("\nTamanho do TreeSet: "+treeSetNumeros.size());
        System.out.println("\nTamanho do HashSet: "+hashSetNumeros.size());
        System.out.println("\nTamanho do LinkedHashSet: "+linkedHashSetNumeros.size());
        System.out.println("\nTreeSet está vazio? "+treeSetNumeros.isEmpty());
        System.out.println("\nHashSet está vazio?: "+hashSetNumeros.isEmpty());
        System.out.println("\nLinkedHashSet está vazio?: "+linkedHashSetNumeros.isEmpty());



    }
}
