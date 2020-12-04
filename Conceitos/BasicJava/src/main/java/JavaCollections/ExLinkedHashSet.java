package JavaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new LinkedHashSet<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(10);
        numeros.add(18);

        System.out.println(numeros);

        numeros.remove(4);
        System.out.println(numeros);
        
        System.out.println("Tamanho: "+numeros.size());

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Integer num: numeros){
            System.out.println("> "+num);
        }

        TreeSet<String> cidades = new TreeSet<>();
        cidades.add("Porto Alegre");
        cidades.add("Florianópolis");
        cidades.add("Curitiba");
        cidades.add("São Paulo");
        System.out.println(cidades);
    }
}
