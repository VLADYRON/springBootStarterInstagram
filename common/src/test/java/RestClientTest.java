import info.thecodinglive.client.AuthInterCeptor;
import info.thecodinglive.client.RestClient;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Created by jins on 2017-02-06.
 */
public class RestClientTest {

    @Test
    public void testAuth()throws IOException{
        String targetUrl="https://api.instagram.com/oauth/access_token";

        OkHttpClient client =  new RestClient.Builder().addNetworkInterceptor(new AuthInterCeptor()).build();

        Request request = new Request.Builder()
        .url(targetUrl).build();

        Response response = client.newCall(request).execute();
        response.body().close();
    }
}
