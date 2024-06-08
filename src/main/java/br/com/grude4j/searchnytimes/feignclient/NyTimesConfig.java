package br.com.grude4j.searchnytimes.feignclient;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NyTimesConfig {

    @Value("${nytimes.api.key}")
    private String apiKey;

    @Bean
    public RequestInterceptor requestInterceptor(){
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.query("api-key", apiKey);
            }
        };

    }

}
