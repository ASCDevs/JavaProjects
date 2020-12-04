package Datas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DataJava8mais {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: "+hoje);//2020-11-26

        LocalDate ontem = hoje.minusDays(1);
        System.out.println("Ontem: "+ontem);//2020-11-25

        LocalTime agora = LocalTime.now();
        System.out.println("Hora agr: "+agora); //15:04:49.599008700

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println("+1 hora: "+maisUmaHora);

        LocalDateTime agr = LocalDateTime.now();
        System.out.println("Agr DateTime: "+agr); //2020-11-26T15:09:59.615584500

        LocalDateTime futuro = agr.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println("Futuroo DateTime(+1h,+2dias,+12seg): "+futuro);
        //2020-11-28T16:10:11.615584500
    }
}
