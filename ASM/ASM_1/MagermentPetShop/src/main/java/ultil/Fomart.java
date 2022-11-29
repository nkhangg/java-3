/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultil;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Fomart {

    public static String parseDate(Date input) throws DateTimeParseException {
        Date sDate = input;
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        String date = formatter1.format(sDate);

        return date;
    }

    public static Date convertDate(String input) throws ParseException {
        java.util.Date date = (java.util.Date) new SimpleDateFormat("dd/MM/yyyy").parse(input);
        return Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(date));
    }

    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date sqlDate = new java.sql.Date(df.parse("2003-02-14").getTime());

        System.out.println(Fomart.parseDate(sqlDate));
    }

}
