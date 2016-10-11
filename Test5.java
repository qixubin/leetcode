import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qixubin on 2016/6/12.
 */
public class Test5 {

    public static void main(String[] argc){

        DateFormat format2 = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println(format2.format(new Date()));
    }
}
