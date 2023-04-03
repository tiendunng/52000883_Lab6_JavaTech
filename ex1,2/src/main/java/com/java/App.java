package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    // Chay chuong trinh: mvn package exec:java -q
    public static void main( String[] args )
    {
        // khoi tao context (Spring IoC container)
        ApplicationContext ct = new AnnotationConfigApplicationContext(Beanconfig.class);

        // yeu cau bean
//        EmailClient client = ct.getBean("client", EmailClient.class);
//        Product p = ct.getBean("product1", Product.class);
//        Product p5 = ct.getBean("product1", Product.class);
//        Product p2 = ct.getBean("product2", Product.class);

        Product product1 = ct.getBean("p1",Product.class);
        Product product2 = ct.getBean("p2",Product.class);

        System.out.println(product1);

        // thuc hien chuc nang

    }
}
