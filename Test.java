import java.security.*;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qixubin on 2016/5/7.
 */
public class Test {

    public static void main(String[] argc) throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
//        String yourString = "123";
//        byte[] bytesOfMessage = yourString.getBytes("UTF-8");
//
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] thedigest = md.digest(bytesOfMessage);
//
//        System.out.println(thedigest);

//        System.out.println(123+"123");


        // TODO Auto-generated method stub
//        int i = 65535;
//        byte[] a = new byte[4];
//        a[0] = (byte) (0xff & i);
//        a[1] = (byte) ((0xff00 & i) >> 8);
//        a[2] = (byte) ((0xff0000 & i) >> 16);
//        a[3] = (byte) ((0xff000000 & i) >> 24);
//        //a  为转换后的byte
//        for (int j = 0; j < a.length; j++) {
//            System.out.println(a[j]);
//        }
//
//
//        System.out.print((byte) 128);

        int a = 1, b =2;
        System.out.println("a="+a+",b="+b);
        swap(a,b);
        System.out.println("a="+a+",b="+b);

        Integer c = 3;
        Integer d = 4;
        System.out.println("c="+c+",d="+d);
        swapIn(c,d);
        System.out.println("c="+c+",d="+d);




        Map map  = new HashMap();
        map.put("abc",0);
        map.put("zzz",1);
        map.put("abc",2);
        System.out.print("1");

        System.out.println("123"+null);
    }


    public static void swap (int a , int b){
        int c = a;
        a = b;
        b = c;

        //int z = null;
    }

    public static void swapIn(Integer a, Integer b){
        Integer temp = a.intValue();
        a = b.intValue();
        b = temp.intValue();
    }
}
