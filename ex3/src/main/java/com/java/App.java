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

        TextEditor t1 = ct.getBean(TextEditor.class);

        t1.input("Three thousand stars");
        t1.save("ok");



    }
}
