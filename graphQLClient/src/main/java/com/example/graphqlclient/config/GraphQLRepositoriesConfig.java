package com.example.graphqlclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.graphql_java_generator.client.SpringContextBean;

@Configuration
@ComponentScan(basePackages = "ariel.jaupi.medium")
public class GraphQLRepositoriesConfig {

    @Bean
    SpringContextBean springContextBean() {
        return new SpringContextBean(SpringContextBean.getApplicationContext());
    }
}
