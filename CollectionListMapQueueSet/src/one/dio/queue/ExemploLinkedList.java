package one.dio.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pat");
        filaBanco.add("Rob");
        filaBanco.add("Fla");
        filaBanco.add("Pam");
        filaBanco.add("And");
        System.out.println(filaBanco);

        String clienteAtendido = filaBanco.poll();
        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

        for (String cliente:filaBanco
             ) {
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("-->"+iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());


        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);
    }
}
