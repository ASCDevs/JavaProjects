package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
    public static void main(String[] args) {
        Map<String, Integer> copas = new HashMap<>();
        copas.put("Brasil",5);
        copas.put("Alemanha",4);
        copas.put("Itália",4);
        copas.put("Uruguai",2);
        copas.put("Argentina",2);
        copas.put("Inglaterra",1);

        System.out.println("Copas: "+copas);

        //Atualiza o valor para chave Brasil
        copas.put("Brasil",6);
        System.out.println("Após atualização: "+copas);

        //Retorna Argentina
        System.out.println("get Argentina: "+copas.get("Argentina"));

        //Retorna se existe ou não França
        System.out.println("França?: "+copas.containsKey("França"));

        //Retorna se existe ou não algum valor com 6
        System.out.println("Algum valor 6?: "+copas.containsValue(6));
        System.out.println("Algum valor 4?: "+copas.containsValue(4));
        System.out.println("Algum valor 5?: "+copas.containsValue(5));

        System.out.println("Tamanho do HashMap: "+copas.size());
        copas.remove("Argentina");
        System.out.println("Após remover Argentina: "+copas);
        System.out.println("Argentina?: "+copas.containsKey("Argentina"));

        for(Map.Entry<String, Integer> valor: copas.entrySet()){
            System.out.println("> "+valor.getKey()+" - "+valor.getValue());
        }

        for(String key: copas.keySet()){
            System.out.println(key +" = "+copas.get(key));
        }
    }
}
