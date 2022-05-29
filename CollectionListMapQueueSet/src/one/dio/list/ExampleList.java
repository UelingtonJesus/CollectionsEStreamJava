package one.dio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("AA");
        nomes.add("uu");
        nomes.add("ff");
        nomes.add("tt");
        nomes.add("mm");
        nomes.add("pp");

        System.out.println(nomes);



        nomes.set(2,"hhh");
        System.out.println(nomes);


        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(2,"lll");
        System.out.println(nomes);

        int posicao = nomes.indexOf("uu");
        System.out.println(posicao);


        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("pp");
        System.out.println(nomes);


        String nome = nomes.get(3);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);
        nomes.remove("lll");
        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAA = nomes.contains("ÇÇ");
        System.out.println(temAA);

        for (String nomeDoItem:
                nomes) {
            System.out.println("--------->"+nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("---->"+iterator.next());
        }


        nomes.clear();

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);



    }

}
