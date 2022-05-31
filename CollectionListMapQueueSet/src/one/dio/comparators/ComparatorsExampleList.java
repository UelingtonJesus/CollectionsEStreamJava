package one.dio.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Ped",19));
        estudantes.add(new Estudante("Car",23));
        estudantes.add(new Estudante("Mar",21));
        estudantes.add(new Estudante("Joa",18));
        estudantes.add(new Estudante("Thi",20));
        estudantes.add(new Estudante("Geo",22));
        estudantes.add(new Estudante("Lar",21));

        System.out.println("\n---- Ordem de inserção ----");
        System.out.println(estudantes);

        System.out.println("\n---- Ordem natural dos números - idade ----");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);


        System.out.println("\n---- Ordem reversa dos números - idade ----");
        estudantes.sort((first, second)-> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        System.out.println("\n---- Ordem natural dos números - idade (method reference) ----");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);


        System.out.println("\n---- Ordem reversa dos números - idade (method reference) ----");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        System.out.println("\n---- Ordem natural dos números - idade (interface Comparable) ----");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("\n---- Ordem reversa dos números - idade (interface Comparable) ----");
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparators());
        System.out.println(estudantes);


    }
}
