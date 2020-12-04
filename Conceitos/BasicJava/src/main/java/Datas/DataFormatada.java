package Datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatada {
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        //26/11/2020 14:49

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        //26 de novembro de 2020 14:49

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        //26 de novembro de 2020 14:49:49 BRT

        Date now = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);

    }
}
