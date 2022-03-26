package co.gov.coran.licencias.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static String dateToString(){
        return dateToString("dd-MM-yyyy");
    }

    public static String dateToString(String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date());
    }

}
