package ultil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {

    public static SimpleDateFormat sdf = new SimpleDateFormat();

    public static Date parse(String text, String pattern) throws ParseException {
        sdf.applyPattern(pattern);
        return sdf.parse(text);
    }

    public static Date parses(String text) throws ParseException {
        return XDate.parse(text, "dd/MM/yyyy");
    }

    public static Date parses(String text, String partten) throws ParseException {
        return XDate.parse(text, partten);
    }
}
