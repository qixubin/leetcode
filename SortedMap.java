import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Map;
import java.util.TreeMap;
import java.security.*;
/**
 * Created by qixubin on 2016/5/7.
 */
public class SortedMap {

    public static void main(String[] argc) throws Exception {
        Map<String, String> map = new TreeMap<String, String>();

// Add Items to the TreeMap
        map.put("appId", "9d6ef3751562a4bed77b7695dd9529f8");
        map.put("projectNo", "2440434400201322");
        map.put("mobile","18616918331");
        map.put("name", "qixubin");
        map.put("applyAmt","2000000");
        map.put("orderDate","20160526190400");
        map.put("commodityName","160小时课时");



// Iterate over them
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }

        sb.append("84481ac179c57d1bdfb4ee02108994d545d9bb8f4ae558a47a94fc7a37e059f3");
        System.out.println(sb.toString());
        String finalString = sb.toString();

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(finalString.getBytes());
        byte[] digest = m.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashtext = bigInt.toString(16);
// Now we need to zero pad it if you actually want the full 32 chars.
        while(hashtext.length() < 32 ){
            hashtext = "0"+hashtext;
        }

        System.out.println(hashtext);

        System.out.println(DigestUtils.md5Hex(finalString));
        System.out.println(MD5ToHex(finalString));
    }

    public static String MD5ToHex(String str) throws Exception {
        MessageDigest md = null;
        StringBuffer sb = new StringBuffer();
        md = MessageDigest.getInstance("md5");
        md.update(str.getBytes("utf-8"));
        for (byte b : md.digest()) {
            sb.append(String.format("%02x", b)); // 10进制转16进制，x 表示以十六进制形式输出，02 表示不足两位前面补0输出
        }
        return sb.toString();

    }
}
/**
 {
 "appId": "34714f194955fb979f6091888783842d",
 "projectNo":"123412341234",
 "name": "qixubin",
 "idNo":"32021119810112387X",
 "mobile":"13958096826",
 "applyAmt":100000,
 "orderDate":"20160507145900",
 "contractAmt":100000,
 "classNo":"class1",
 "courseName":"english",
 "contractNo":"12345",
 "contractUrl":"baidu.com",
 "commodityName":"iphone6",
 "signvalue":"1c8e9a16ec9c802b0689fad516d55b5d"
 }

 **/
