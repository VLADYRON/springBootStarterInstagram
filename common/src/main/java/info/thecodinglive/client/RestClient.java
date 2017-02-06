package info.thecodinglive.client;

import okhttp3.*;
import org.springframework.stereotype.Component;

import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;

/**
 * Created by jins on 2017-02-06.
 */
@Component
public class RestClient extends OkHttpClient{
    public RestClient() {
        super();
    }

    @Override
    public int connectTimeoutMillis() {
        return super.connectTimeoutMillis();
    }

    @Override
    public int readTimeoutMillis() {
        return super.readTimeoutMillis();
    }

    @Override
    public int writeTimeoutMillis() {
        return super.writeTimeoutMillis();
    }

    @Override
    public Proxy proxy() {
        return super.proxy();
    }

    @Override
    public ProxySelector proxySelector() {
        return super.proxySelector();
    }

    @Override
    public CookieJar cookieJar() {
        return super.cookieJar();
    }

    @Override
    public Cache cache() {
        return super.cache();
    }

    @Override
    public Dns dns() {
        return super.dns();
    }

    @Override
    public SocketFactory socketFactory() {
        return super.socketFactory();
    }

    @Override
    public SSLSocketFactory sslSocketFactory() {
        return super.sslSocketFactory();
    }

    @Override
    public HostnameVerifier hostnameVerifier() {
        return super.hostnameVerifier();
    }

    @Override
    public CertificatePinner certificatePinner() {
        return super.certificatePinner();
    }

    @Override
    public Authenticator authenticator() {
        return super.authenticator();
    }

    @Override
    public Authenticator proxyAuthenticator() {
        return super.proxyAuthenticator();
    }

    @Override
    public ConnectionPool connectionPool() {
        return super.connectionPool();
    }

    @Override
    public boolean followSslRedirects() {
        return super.followSslRedirects();
    }

    @Override
    public boolean followRedirects() {
        return super.followRedirects();
    }

    @Override
    public boolean retryOnConnectionFailure() {
        return super.retryOnConnectionFailure();
    }

    @Override
    public Dispatcher dispatcher() {
        return super.dispatcher();
    }

    @Override
    public List<Protocol> protocols() {
        return super.protocols();
    }

    @Override
    public List<ConnectionSpec> connectionSpecs() {
        return super.connectionSpecs();
    }

    @Override
    public List<Interceptor> interceptors() {
        return super.interceptors();
    }

    @Override
    public List<Interceptor> networkInterceptors() {
        return super.networkInterceptors();
    }

    @Override
    public Call newCall(Request request) {
        return super.newCall(request);
    }

    @Override
    public Builder newBuilder() {
        return super.newBuilder();
    }
}
