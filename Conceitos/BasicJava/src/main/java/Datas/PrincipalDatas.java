package Datas;
//java.util.Date; Antigo método de trabalhar com datas
import java.util.Date;

public class PrincipalDatas {
    public static void main(String[] args) {
        Date novaData = new Date();
        System.out.println("1 - Date: "+novaData); //Thu Nov 26 13:41:00 BRT 2020

        Long millisTime = System.currentTimeMillis();
        System.out.println("2 - Milisegundos: "+millisTime);

        Date dataMillis = new Date(millisTime);
        System.out.println("3 - Data from Millis: "+dataMillis);

        Date dataNoPassado = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 08:13:27 BRST 2021

        /** Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);
        //false

        /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true

    }
}
