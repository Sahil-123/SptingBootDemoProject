package com.DemoProject.SpringBoot.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class WeatherAPIInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        // Check if the URL already contains parameters
        template.header("Accept", "application/json");

        String key = "appid=7a07e1bf6fc4ac9c41053fbf656d825b";
        String url = template.url();

        if (!url.contains("?")) {
            // Append query parameter if none exists
            template.uri(url + "?"+key);
        } else {
            // Append additional parameter to existing query
            template.uri(url + "&"+key);
        }

//        System.out.println(template.url());
    }

}
