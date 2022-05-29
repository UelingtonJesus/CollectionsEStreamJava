package one.dio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.stream;

/*
1- Crie uma lista
Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
Navegue na lista exibindo os nomes no console
Substitua Carlos por Roberto
Retorne o nome da posição 1
Remova o nome da posição 4
Remova o nome João
Retorne a quantidade de itens na lista
Verifique se existe o nome Juliano na lista
Crie uma nova lista com os nomes: Ismael e Rodrigo
Adicione os itens da nova lista na primeira lista
Ordene os itens da lista por ordem alfabética
Verifique se a lista está vazia


 */
public class ExercicioList {
    public static void main(String[] args) {
//1- Crie uma lista
        List<String> nomes = new ArrayList<>();
//Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegue na lista exibindo os nomes no console
        System.out.println(nomes);
        //Substitua Carlos por Roberto
        nomes.set(2,"Roberto");
        //Retorne o nome da posição 1
        System.out.println(nomes.get(1));
        //Remova o nome da posição 4
        nomes.remove(4);
        //Remova o nome João
        nomes.remove("João");
        //Retorne a quantidade de itens na lista
        System.out.println(nomes.size());
        //Verifique se existe o nome Juliano na lista
        nomes.contains("Juliano");
        //Crie uma nova lista com os nomes: Ismael e Rodrigo
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println(nomes2);
        //Adicione os itens da nova lista na primeira lista
        nomes.addAll(nomes2);
        System.out.println(nomes);
        //Ordene os itens da lista por ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);
        //Verifique se a lista está vazia
        System.out.println(nomes.isEmpty());


    }
}
