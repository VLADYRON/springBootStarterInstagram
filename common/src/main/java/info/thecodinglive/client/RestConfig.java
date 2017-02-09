package info.thecodinglive.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by woowahan on 2017. 2. 9..
 */
@Configuration
@PropertySource("classpath:apiinfo.properties")
public class RestConfig {

    @Value("${instagram.id}")
    private String instagramClientId;

    @Value("${instagram.secret}")
    private String instagramClientSecret;

    @Bean
    public AuthInterceptor authInterceptor() {
        return new AuthInterceptor(instagramClientId, instagramClientSecret);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurerSupport() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println(instagramClientId);
        };
    }


}
