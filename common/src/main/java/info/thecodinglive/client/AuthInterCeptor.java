package info.thecodinglive.client;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by jins on 2017-02-06.
 */
public class AuthInterceptor implements Interceptor {

    private String clientId;
    private String clientSecret;

    public AuthInterceptor(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        HttpUrl url = chain.request().url()
                .newBuilder()
                .addQueryParameter("client_id", clientId)
                .addQueryParameter("redirect_uri", "http://blog.woniper.net")
                .addQueryParameter("response_type", "code")
                .build();
        Request request = chain.request().newBuilder().url(url).build();
        return chain.proceed(request);
    }
}
