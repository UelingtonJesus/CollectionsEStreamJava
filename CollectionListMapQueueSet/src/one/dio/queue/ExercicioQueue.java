package one.dio.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Jul");
        nomes.add("Ped");
        nomes.add("Car");
        nomes.add("Lar");
        nomes.add("João");
        System.out.println(nomes);
        String primeiroNomeLista = nomes.element();
        System.out.println(primeiroNomeLista);
        String removePrimeiroNomeLista = nomes.poll();
        System.out.println(removePrimeiroNomeLista);
        System.out.println(nomes);
        nomes.add("Dan");
        System.out.println(nomes);
        System.out.println(nomes.size());
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.contains("Car"));
    }
}
