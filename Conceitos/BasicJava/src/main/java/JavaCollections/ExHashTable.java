package JavaCollections;

import java.util.Hashtable;
import java.util.Map;

public class ExHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer>  pessoas = new Hashtable<>();
        pessoas.put("Carlos",21);
        pessoas.put("Mariana",33);
        pessoas.put("Rafaela",18);
        pessoas.put("Pedro",44);


        System.out.println(pessoas);
        System.out.println(pessoas.get(40));

        pessoas.put("Pedro",55);
        System.out.println(pessoas);

        pessoas.remove("Pedro");
        System.out.println(pessoas);

        int idadeMariana = pessoas.get("Mariana");

        System.out.println("Idade mariana: "+idadeMariana);
        System.out.println("Tamanho: "+pessoas.size());

        //Navegação entre os registros
        for(Map.Entry<String, Integer> v: pessoas.entrySet()){
            System.out.println("> "+v.getKey()+", "+v.getValue());
        }

        for (String key: pessoas.keySet()){
            System.out.println("- "+key+" | "+pessoas.get(key));
        }
    }
}
