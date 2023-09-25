package hu.nye.progtech.helloword;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GreetingsGenerator generator = new GreetingsGenerator();
        RenderService renderer = new RenderService();
        System.out.println(renderer.render(generator.generateGreeting("Uram")));
    }
}