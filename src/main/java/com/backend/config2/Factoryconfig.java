package com.backend.config2;


import com.backend.domain.entities.mt.message.ObjectFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factoryconfig {

    @Bean
    public ObjectFactory objectFactory() {
        return new ObjectFactory();
    }
}
