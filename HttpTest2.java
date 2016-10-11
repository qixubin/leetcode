import com.google.gson.Gson;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;


import java.io.IOException;
import java.io.InputStream;


/**
 * Created by qixubin on 2016/5/19.
 */
public class HttpTest2 {

    public static void main(String[] argc) throws IOException {
        String       postUrl       = "https://uattest.memedai.cn/merchantApp/merchant/open/submitOrder/zmlearn";// put in your url
        Gson gson          = new Gson();
        HttpClient   httpClient    = HttpClientBuilder.create().build();
        HttpPost     post          = new HttpPost(postUrl);


        POJO pojo1 = new POJO("34714f194955fb979f6091888783842d"
                ,"123412341234"
                ,"qixubin"
                ,"13958096826"
                ,100000
                ,"20160507145900"
                ,"iphone6"
                ,"3efe5034724c51a13b95800a32cea22d"
            );

        StringEntity postingString = new StringEntity(gson.toJson(pojo1));//gson.tojson() converts your pojo to json
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");
        HttpResponse  response = httpClient.execute(post);
        System.out.println(response.getStatusLine().getStatusCode());


        InputStream inputStream  = response.getEntity().getContent();
        String myString = IOUtils.toString(inputStream, "UTF-8");
        System.out.println(myString);
    }
}


class POJO
{
    String appId;
    String projectNo;
    String name;
    String mobile;
    int applyAmt;
    String orderDate;
    String commodityName;
    String signvalue;

//generate setter and getters

    public POJO(String appId, String projectNo, String name, String mobile, int applyAmt, String orderDate, String commodityName, String signvalue){
        this.appId = appId;
        this.projectNo = projectNo;
        this.name= name;
        this.mobile = mobile;
        this.applyAmt = applyAmt;
        this.orderDate = orderDate;
        this.commodityName = commodityName;
        this.signvalue = signvalue;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getApplyAmt() {
        return applyAmt;
    }

    public void setApplyAmt(int applyAmt) {
        this.applyAmt = applyAmt;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getSignvalue() {
        return signvalue;
    }

    public void setSignvalue(String signvalue) {
        this.signvalue = signvalue;
    }
}