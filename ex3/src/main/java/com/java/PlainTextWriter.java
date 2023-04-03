package com.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PlainText")
public class PlainTextWriter implements TextWriter{
    @Override
    public void write(String file, String content) {
        System.out.println("Plain text file name is: " + file +", content: " + content);
    }
}
