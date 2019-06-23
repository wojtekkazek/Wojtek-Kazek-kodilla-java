package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String poemText, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(poemText);
        System.out.println(result);
    }
}

