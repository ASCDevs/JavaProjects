package JavaCollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExHashSet {
    public static void main(String[] args){
        Set<Double> notas = new HashSet<>();
        notas.add(5.8);
        notas.add(9.3);
        notas.add(8.5);
        notas.add(7.3);
        notas.add(6.0);
        notas.add(10.0);
        notas.add(4.8);
        notas.add(7.8);
        notas.add(8.8);
        System.out.println(notas);

        notas.remove(4.8);

        System.out.println("Nota Removida: 4.8\nNotas: "+notas);

        System.out.println("Tamanho: "+notas.size());

        Iterator<Double> iterator = notas.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Double nota: notas){
            System.out.println("> "+nota);
        }

        System.out.println(notas.isEmpty());
        notas.clear();
        System.out.println(notas.isEmpty());

        HashSet<Integer> ns = new HashSet<>();
        ns.add(4);
        ns.add(2);
        ns.add(23);
        ns.add(14);
        ns.add(55);
        ns.add(44);
        System.out.println(ns);


    }
}
