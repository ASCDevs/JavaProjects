package Datas;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        //System.out.println(agora); //Info Completa
        System.out.println("A data corrente é: "+agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: "+agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: "+agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: "+agora.getTime());

        Calendar now = Calendar.getInstance();

        System.out.printf("1 - %tc\n",agora);
        //s�b mar 11 14:35:38 BRT 2023

        System.out.printf("2 - %tF\n",agora);
        //2023-03-11

        System.out.printf("3 - %tD\n",agora);
        //03/11/23

        System.out.printf("4 - %tr\n",agora);
        //02:35:38 PM

        System.out.printf("5 - %tT\n",agora);
        //14:35:38
    }
}
