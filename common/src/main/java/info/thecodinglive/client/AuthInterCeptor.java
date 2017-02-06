package info.thecodinglive.client;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by jins on 2017-02-06.
 */
@Component
@PropertySource("apiinfo.properties")
public class AuthInterCeptor implements Interceptor{

    public AuthInterCeptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        HttpUrl url = chain.request().url()
                .newBuilder()
                .addQueryParameter("client_id", "clientid")
                .addQueryParameter("client_secret", "client_secret")
                .addQueryParameter("grant_type", "authorization_code'")
                .addQueryParameter("redirect_uri", "callbackUrl")
                .addQueryParameter("code", "CODE")
                .build();
        Request request = chain.request().newBuilder().url(url).build();
        return chain.proceed(request);
    }
}
