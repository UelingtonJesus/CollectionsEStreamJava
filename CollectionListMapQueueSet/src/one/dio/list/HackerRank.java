package one.dio.list;

import java.util.*;

public class HackerRank {

    public static void main(String[] args) {

       /* double[] duracoes=new double[5];
        int acharMinimoDeDias = 0;
        double max = duracoes[0];
        double min = duracoes[0];
        for(int i = 0; i < 5; i++){
            duracoes[i] = scan.nextDouble();

            if(duracoes[i] > max){
                max = duracoes[i];

            }if(duracoes[i]<min){
                min = duracoes[i];
            }
           if(max + min > 0 && max + min <=3){
               acharMinimoDeDias++;
           }

        }
        System.out.println(acharMinimoDeDias);*/
        Scanner scan = new Scanner(System.in);
        int duracoesCount = scan.nextInt();
        int acharMinimoDeDias = 0;
        double resto = 0d;
        List<Float> duracoes = new Vector<>();
        for(int i = 0; i < duracoesCount; i++){
            duracoes.add(scan.nextFloat());
        }
        Iterator<Float> iterator = duracoes.iterator();
        int somaInt = 0;
        double somaResto = 0d;
        while(iterator.hasNext()){
            Float next = iterator.next();
            somaInt+=next;
            somaResto+=next;
            acharMinimoDeDias = somaInt/3;
            if(somaResto % 3 != 0){
                acharMinimoDeDias+=1;
            }
        }
        System.out.println(acharMinimoDeDias);





    }


}
