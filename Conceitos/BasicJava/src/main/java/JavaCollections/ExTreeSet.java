package JavaCollections;

import java.util.TreeSet;

public class ExTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitais = new TreeSet<>();
        capitais.add("São Paulo");
        capitais.add("Fortaleza");
        capitais.add("Belo Horizonte");
        capitais.add("Porto Alegre");
        capitais.add("Salvador");
        System.out.println(capitais);

        //Retorna o topo da árvore
        System.out.println("Topo: "+capitais.first());

        //Retorna o final da árvore
        System.out.println("Final: "+capitais.last());

        //Retorna primeiro elemento abaixo na arvore parametrizada
        System.out.println("Abaixo de Fortaleza: "+capitais.lower("Fortaleza"));

        //Retorna primeiro elemento acima na arvore parametrizada
        System.out.println("Acima de Salvador: "+capitais.higher("Salvador"));

        //Retorna o primeiro elemento do topo da arvore e remove
        System.out.println("Topo removido: "+capitais.pollFirst());
        System.out.println("Capitais: "+capitais);

        //Retorna o primeiro elemento do final da arvore e remove
        System.out.println("Final removido: "+capitais.pollLast());
        System.out.println("Capitais: "+capitais);

        TreeSet<String> city = new TreeSet<>();
        city.add("Porto Alegre");
        city.add("Florianópolis");
        city.add("Curitiba");
        city.add("São Paulo");
        city.add("Rio de Janeiro");
        System.out.println(city);
        System.out.println(city.higher("Florianópolis"));

    }
}
