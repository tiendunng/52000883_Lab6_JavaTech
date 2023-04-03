package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "com.java")
@PropertySource("db.properties")
public class Beanconfig {
    @Bean
    @Scope("singleton")
    public Product p1(){
        return new Product(4,"Samsung galaxy s10","white",1000);
    }

    @Bean
    @Scope("prototype")
    public Product p2(){
        return new Product(5,"Samsung galaxy s22 ultra","grey",2000);
    }

}
