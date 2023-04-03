package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
    private String text;
    private TextWriter writer;


    public TextEditor(@Autowired @Qualifier("PlainText") TextWriter writer) {
        this.writer = writer;
    }

    public void save(String s){
        writer.write(s,text);
    }

    public void input(String s){
        this.text = s;
    }
}
