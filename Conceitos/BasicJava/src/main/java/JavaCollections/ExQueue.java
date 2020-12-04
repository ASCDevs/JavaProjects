package JavaCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {
    public static void main(String[] args){
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("Fila inicio: "+filaBanco);

        //Remove o primeiro da fila e retorna-o
        //Retorna null se a fila está vazia
        String saiu = filaBanco.remove();
        System.out.println("Saiu: "+saiu+"\nfilaBanco: "+filaBanco);

        //Remove primeiro da fila
        //Retorna um null caso esteja vazia
        String saiuPoll = filaBanco.poll();
        System.out.println("Saiu Poll: "+saiuPoll+"\nFila do banco: "+filaBanco);

        //Peek retorna o primeiro da fila, porem n remove
        //Retorna null caso esteja vazia
        String saiuPeek =  filaBanco.peek();
        System.out.println("Saiu peek: "+saiuPeek+"\nFila banco: "+filaBanco);


        //Element retorna o primeiro da fila, porem n remove
        //Retorna Exception caso esteja vazia
        String saiuElement = filaBanco.element();
        System.out.println("Saiu element: "+saiuElement+"\nFila banco: "+filaBanco);

        for(String cliente: filaBanco){
            System.out.println("Cliente: "+cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("> "+iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
        filaBanco.clear();
        System.out.println(filaBanco.isEmpty());

        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        String filaFrente = nomes.peek();
        System.out.println("Primeiro: "+filaFrente+"\nFila: "+nomes);

        String saiuFrente = nomes.poll();
        System.out.println("Saiu: "+saiuFrente+"\nFila: "+nomes);

        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println("Tamanho: "+nomes.size());
        System.out.println("Carlos?: "+nomes.contains("Carlos"));

        Queue<String> filaVazia = new LinkedList<>();
        System.out.println(filaVazia.poll());
    }
}
