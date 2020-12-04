package Arrays;


public class Matrizes {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        int[] idades = new int[5];

        nomes[0] = "Alexandre";
        nomes[1] = "Avenilza";
        nomes[2] = "Laura";
        nomes[3] = "Juliana";
        nomes[4] = "Roberto";

        idades[0] = 22;
        idades[1] = 47 ;
        idades[2] = 8 ;
        idades[3] = 22;
        idades[4] = 48;

        String[] seila = {"","","","",""};
        int[] ns = {1,2,3,4,5};

        System.out.println("Tamanho nomes: "+nomes.length);

        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]+", "+idades[i]);
        }

        int[][] mult = {{1,2,4},{1,2}};


    }
}
