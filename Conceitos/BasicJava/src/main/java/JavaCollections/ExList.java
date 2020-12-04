package JavaCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ExList {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Alexandre");
        nomes.add("Afonso");
        nomes.add("Adilson");
        nomes.add("Maria");

        nomes.set(3,"Avenilza");

        System.out.println(nomes);
        Collections.sort(nomes);

        nomes.set(0,"Amimir");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Amimir");
        System.out.println(nomes);

        String nome1,nome2;
        nome1 = nomes.get(0);
        nome2 = nomes.get(2);
        System.out.println("Nome1: "+nome1+"\nNome2: "+nome2);

        int tamanho = nomes.size();
        System.out.println("Tamanho: "+tamanho);

        System.out.println("Contem Amimir?: "+nomes.contains("Amimir")+"\nContém Alexandre?: "+nomes.contains("Alexandre"));
        System.out.println("Lista Vazia?: "+nomes.isEmpty());
        nomes.clear();
        System.out.println("Lista vazia?: "+nomes.isEmpty());

        nomes.add("Avenilza");
        nomes.add("Maria");
        nomes.add("Laura");
        nomes.add("Juliana");

        System.out.println("Indice de Laura: "+nomes.indexOf("Laura"));
        System.out.println("Indice de Alexandre: "+nomes.indexOf("Alexandre"));

        for(String n: nomes){
            System.out.println("Nome:"+n);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("> "+iterator.next());
        }
        nomes.addAll(nomes);
        System.out.println(nomes);
    }
}
