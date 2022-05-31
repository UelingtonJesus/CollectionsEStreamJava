package one.dio.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {
    public static void main(String[] args) {
        //Adicionar 26 estados brasileiros com chave = sigla e valor = nome
        Map<String, String> estados = new HashMap<>();
        estados.put("ES","Espírito Santo");
        estados.put("MG","Minas Gerais");
        estados.put("RJ","Rio de Janeiro");
        estados.put("SC","Santa Catarina");
        estados.put("SP","São Paulo");
        estados.put("AC","Acre");
        estados.put("AL","Alagoas");
        estados.put("AM","Amazonas");
        estados.put("BA","Bahia");
        estados.put("CE","Ceará");
        estados.put("GO","Goiás");
        estados.put("MA","Maranhão");
        estados.put("PA","Pará");
        estados.put("PE","Pernambuco");
        estados.put("PI","Piauí");
        estados.put("RO","Rondônia");
        estados.put("SE","Sergipe");
        estados.put("TO","Tocantins");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("RN","Rio Grande do Norte");
        estados.put("RS","Rio Grande do Sul");
        estados.put("AP","Amapá");
        estados.put("MT","Mato Grosso");
        estados.put("PB","Paraíba");
        estados.put("PR","Paraná");
        estados.put("RR","Roraima");



        TreeMap<String, String>estados1 = new TreeMap<>();
        estados1.put("ES","Espírito Santo");
        estados1.put("MG","Minas Gerais");
        estados1.put("RJ","Rio de Janeiro");
        estados1.put("SC","Santa Catarina");
        estados1.put("SP","São Paulo");
        estados1.put("AC","Acre");
        estados1.put("AL","Alagoas");
        estados1.put("AM","Amazonas");
        estados1.put("BA","Bahia");
        estados1.put("CE","Ceará");
        estados1.put("GO","Goiás");
        estados1.put("MA","Maranhão");
        estados1.put("PA","Pará");
        estados1.put("PE","Pernambuco");
        estados1.put("PI","Piauí");
        estados1.put("RO","Rondônia");
        estados1.put("SE","Sergipe");
        estados1.put("TO","Tocantins");
        estados1.put("MS","Mato Grosso do Sul");
        estados1.put("RN","Rio Grande do Norte");
        estados1.put("RS","Rio Grande do Sul");
        estados1.put("AP","Amapá");
        estados1.put("MT","Mato Grosso");
        estados1.put("PB","Paraíba");
        estados1.put("PR","Paraná");
        estados1.put("RR","Roraima");

        Hashtable<String, String>estados2 = new Hashtable<>();
        estados2.put("ES","Espírito Santo");
        estados2.put("MG","Minas Gerais");
        estados2.put("RJ","Rio de Janeiro");
        estados2.put("SC","Santa Catarina");
        estados2.put("SP","São Paulo");
        estados2.put("AC","Acre");
        estados2.put("AL","Alagoas");
        estados2.put("AM","Amazonas");
        estados2.put("BA","Bahia");
        estados2.put("CE","Ceará");
        estados2.put("GO","Goiás");
        estados2.put("MA","Maranhão");
        estados2.put("PA","Pará");
        estados2.put("PE","Pernambuco");
        estados2.put("PI","Piauí");
        estados2.put("RO","Rondônia");
        estados2.put("SE","Sergipe");
        estados2.put("TO","Tocantins");
        estados2.put("MS","Mato Grosso do Sul");
        estados2.put("RN","Rio Grande do Norte");
        estados2.put("RS","Rio Grande do Sul");
        estados2.put("AP","Amapá");
        estados2.put("MT","Mato Grosso");
        estados2.put("PB","Paraíba");
        estados2.put("PR","Paraná");
        estados2.put("RR","Roraima");

        System.out.println(estados.size()+" - "+estados1.size()+" - "+estados2.size());
        //Remover o estado de Minas Gerais

        System.out.println("\nRemover o estado de Minas Gerais HashMap");
        estados.remove("MG");
        System.out.println(estados);
        System.out.println(estados.size());

        System.out.println("\nRemover o estado de Minas Gerais HashTable");
        estados2.remove("MG");
        System.out.println(estados2);
        System.out.println(estados2.size());

        System.out.println("\nRemover o estado de Minas Gerais TreeMap");
        estados1.remove("MG");
        System.out.println(estados1);
        System.out.println(estados1.size());
        //Adicionar o Distrito Federal

        System.out.println("\nAdicionar o Distrito Federal HashMap");
        estados.put("DF","Distrito Federal");
        System.out.println(estados);
        System.out.println("\nAdicionar o Distrito Federal TreeMap");
        estados1.put("DF","Distrito Federal");
        System.out.println(estados1);
        System.out.println("\nAdicionar o Distrito Federal HashTable");
        estados2.put("DF","Distrito Federal");
        System.out.println(estados2);

        //Retornar o tamanho do map
        System.out.println("HashMap: "+estados.size()+" - "+"TreeMap: "+estados1.size()+" - "+"HashTable: "+estados2.size());
        //Remover o estado de Mato Grosso do Sul usando o nome
        System.out.println("\nRemover o estado de Mato Grosso do Sul usando o nome");
        estados.remove("MS","Mato Grosso do Sul");
        System.out.println(estados);
        System.out.println(estados.size());

        //Navegar e mostrar os registros no seguinte formato:Nome(Sigla)
        for (Map.Entry<String, String>entry: estados.entrySet()) {
            System.out.println(entry.getValue()+"--"+entry.getKey());
        }

        //Buscar o estado de Santa Catarina buscando por sua sigla
        System.out.println("\nBuscar o estado de Santa Catarina buscando por sua sigla\n"+estados.containsKey("SC"));
        System.out.println("\nBuscar o estado de Santa Catarina buscando por sua sigla\n"+estados1.containsKey("SC"));
        System.out.println("\nBuscar o estado de Santa Catarina buscando por sua sigla\n"+estados2.containsKey("SC"));

        //Buscar o estado do Maranhão buscando por seu nome
        System.out.println("\nBuscar o estado do Maranhão buscando por seu nome\n"+estados.containsValue("Maranhão"));
        System.out.println("\nBuscar o estado do Maranhão buscando por seu nome\n"+estados1.containsValue("Maranhão"));
        System.out.println("\nBuscar o estado do Maranhão buscando por seu nome\n"+estados2.containsValue("Maranhão"));
    }
}
