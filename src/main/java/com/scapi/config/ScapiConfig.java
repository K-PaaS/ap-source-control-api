package com.scapi.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by lena on 2017-06-14.
 */
@Configuration
@EnableJpaRepositories("com.scapi.repository")
@EntityScan("com.scapi.entity")
@ComponentScan(basePackages = "com")
public class ScapiConfig {

    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();

        factory.addConnectorCustomizers(connector -> {
            connector.setAllowTrace(true);
        });
        return factory;
    }
}

