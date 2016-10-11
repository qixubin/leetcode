
import com.sun.deploy.net.HttpResponse;
import org.apache.http.client.HttpClient;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Created by qixubin on 2016/5/19.
 */
public class HttpTest {

    public static void main(String[] argc){
        HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead

        try {
//            HttpPost request = new HttpPost("http://yoururl");
//            StringEntity params =new StringEntity("details={\"name\":\"myname\",\"age\":\"20\"} ");
//            request.addHeader("content-type", "application/x-www-form-urlencoded");
//            request.setEntity(paramss);
//            HttpResponse response = httpClient.execute(request);


            // handle response here...
        }catch (Exception ex) {
            // handle exception here
        } finally {
            httpClient.getConnectionManager().shutdown(); //Deprecated
        }

    }
}
