package one.dio.list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        esportes.add("futebol");
        esportes.add("basquete");
        esportes.add("tenis");
        esportes.add("volei");

        System.out.println("\n======================\n"+esportes);
        //Altera o valor da posição 2 do vetor
        esportes.set(2, "ping pong");
        System.out.println("\n======================\n"+esportes);
        //remove o item de index 2 do vetor
        esportes.remove(2);
        System.out.println("\n======================\n"+esportes);

        esportes.remove("volei");
        System.out.println("\n======================\n"+esportes);

        System.out.println("\n======================\n"+esportes.get(0));


        //Navega nos esportes
        for (String esporte:esportes
             ) {
            System.out.println("\n======================\n"+esporte);
        }
    }


}
