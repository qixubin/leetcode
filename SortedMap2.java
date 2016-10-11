import org.apache.commons.codec.digest.DigestUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by qixubin on 2016/5/7.
 */
public class SortedMap2 {

    public static void main(String[] argc) throws Exception {
        Map<String, String> map = new TreeMap<String, String>();

//        map.put("projectNo", "2440291000164765");
//        map.put("auditStatus", "100");
//        map.put("auditDesc", "successful");
//        map.put("term", "3");
//        map.put("amt","2000000");
//        //40ef226cc2a5f91f0411aefb750574aa

            map.put("projectNo", "2440291000164765");
         map.put("auditStatus", "101");
         map.put("auditDesc", "资质不符或信息不完整");
//4796ebd9639e19b5559b19f83f931476

//        map.put("projectNo", "2438368521696581");
//        map.put("auditStatus", "101");
//        map.put("auditDesc", "fail");
//188ae425b21d478ff57d537ed2866c35


//        map.put("appId","34714f194955fb979f6091888783842d");
//        map.put("projectNo", "2440291000164765");
//        map.put("bidAmt","2000000");
//        map.put("loanTime", "1463033143909");
//        map.put("resultCode", "100");
//        map.put("resultMessage", "successful");
//9ff2e1878edff711b8b3875863888750


//        map.put("appId","34714f194955fb979f6091888783842d");
//        map.put("projectNo", "2440291000164765");
//        map.put("bidAmt","2000000");
//        map.put("loanTime", "1463033143909");
//        map.put("resultCode", "101");
//1fddae41e3f1a94ba6348fbebc1512fd

//        map.put("appId","34714f194955fb979f6091888783842d");
//        map.put("projectNo", "2438368521696581");
//        map.put("bidAmt","2000000");
//        map.put("loanTime", "1463033143909");
//        map.put("resultCode", "101");
        //ea5eb868843231052ddd047f064923eb

//        map.put("projectNo", "2440291000164765");
//        map.put("remainPrincipal","1000000");
//        map.put("totalTerm", "6");
//        map.put("currentTerm", "2");
//        map.put("termAmt", "500000");
//3c8e24d9c9e28da5020e277a09acffcf
//a149ea520d78f21a2f6a9b6dc5e5fd90




        //System.out.println("===="+new Date().getTime());

// Iterate over them
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }

        //uat
        sb.append("5b2efc671f19f621e444a70ff9f4b901fcadd098c1fb839e46c5bb20d044b6c3");
        //prod
        //sb.append("84481ac179c57d1bdfb4ee02108994d545d9bb8f4ae558a47a94fc7a37e059f3");
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
