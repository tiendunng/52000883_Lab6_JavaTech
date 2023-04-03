package com.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PDF")
public class PDFTextWriter implements TextWriter{
    @Override
    public void write(String file, String content) {
        System.out.println("PDF file name is: " + file +", content: " + content);

    }
}
