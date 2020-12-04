package JavaCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> capitais = new TreeMap<>();
        capitais.put("RS","Porto Alegre");
        capitais.put("SC","Florianópolis");
        capitais.put("PR","Curitiba");
        capitais.put("SP","São Paulo");
        capitais.put("RJ","Rio de Janeiro");
        capitais.put("MG","Belo Horizonte");
        //Não irá ficar na ordem que adicionamos
        System.out.println("Capitais: "+capitais);

        //Retorno do topo da árvore
        System.out.println("Topo da árvore: "+capitais.firstKey());

        //Retorno do final da árvore
        System.out.println("Final da árvore: "+capitais.lastKey());

        //Retorna primeira capital abaixo na árvore parametrizada
        System.out.println("Capital abaixo SC: "+capitais.lowerKey("SC"));

        //Retorna primeira capital acima na árvore parametrizada
        System.out.println("Capital acima SC: "+capitais.higherKey("SC"));

        System.out.println("Todas as capitais: "+capitais);

        //Dados do elemento do topo da árvore
        System.out.println(capitais.firstEntry().getKey()+" = "+capitais.firstEntry().getValue());

        //Dado do elemento na base da árvore
        System.out.println(capitais.lastEntry().getKey()+" = "+capitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo na arvore parametrizada
        System.out.println(capitais.lowerEntry("SC").getKey()+" , "+capitais.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima na arvore parametrizada
        System.out.println(capitais.higherEntry("SC").getKey()+" , "+capitais.higherEntry("SC").getValue());

        Map.Entry<String, String> firstEntry =  capitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();
        System.out.println("FistEntry: "+firstEntry+"\nLastEntry: "+lastEntry);

        System.out.println(capitais);

        //Formas de iterar
        Iterator<String> iterator = capitais.keySet().iterator();
        
        while(iterator.hasNext()){
            String chave = iterator.next();
            System.out.println("> "+chave+" - "+capitais.get(chave));
        }

        for(Map.Entry<String, String> valor: capitais.entrySet()){
            System.out.println(valor.getKey()+ ", "+valor.getValue());
        }


    }
}
