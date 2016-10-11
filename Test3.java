import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by qixubin on 2016/6/12.
 */
public class Test3 {

    public static void main(String[] argc){
//        String a = "197-194-";
//
//        StringTokenizer st = new StringTokenizer(a,"-");
//
//        ArrayList<Integer> li= new ArrayList<Integer>();
//
//        while( st.hasMoreElements() ){
//
//            li.add(Integer.parseInt( st.nextToken() ));
//
//        }
//
//        System.out.println("aa");

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("aa","bb");
        hm.put("aa","cc");

        System.out.println(hm.get("aa"));
    }
}
