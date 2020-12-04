package JavaCollections;

import java.util.List;
import java.util.Vector;

public class ExVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Natação");
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Ping Pong");
        System.out.println(esportes);

        esportes.set(1,"Handball");
        System.out.println(esportes);

        esportes.remove(3);
        System.out.println(esportes);

        esportes.remove("Handball");
        System.out.println(esportes);

        System.out.println(esportes.get(0));

        for(String e: esportes){
            System.out.println("> "+e);
        }
    }
}
