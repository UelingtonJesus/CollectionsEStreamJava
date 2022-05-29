package one.dio.map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();
        estudantes.put("Carlos", 21);
        estudantes.put("Mari", 33);
        estudantes.put("Pam", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        System.out.println("\nRemove estudante do índice 0");
        estudantes.remove(0);
        System.out.println(estudantes);

        System.out.println("\nRecupera estudante do índice 2");
        int idadeEstudante = estudantes.get("Mari");
        System.out.println(idadeEstudante);

        System.out.println("\nRetorna tamanho do mapa");
        System.out.println(estudantes.size());

        System.out.println("\nNavega nos registros do mapa");
        for (Map.Entry<String, Integer>entry: estudantes.entrySet()
             ) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        for (String key: estudantes.keySet()
             ) {
            System.out.println(key+" -- "+estudantes.get(key));
        }






    }
}
