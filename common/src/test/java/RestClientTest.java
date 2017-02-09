import info.thecodinglive.client.AuthInterceptor;
import info.thecodinglive.client.RestClient;
import info.thecodinglive.client.RestConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jins on 2017-02-06.
 */
public class RestClientTest {

    @Test
    public void testAuth()throws IOException{
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RestConfig.class);
        AuthInterceptor authInterceptor = applicationContext.getBean(AuthInterceptor.class);

        String targetUrl="https://api.instagram.com/oauth/authorize";
        OkHttpClient client =  new RestClient.Builder().addNetworkInterceptor(authInterceptor).build();
        Request request = new Request.Builder().url(targetUrl).build();
        Response response = client.newCall(request).execute();
        ResponseBody body = response.body();

        assertThat(response.code()).isEqualTo(200);
        body.string();
    }
}
