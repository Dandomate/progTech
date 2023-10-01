package hu.nye.progtech.homework2;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        if (args.length ==0 || args.length >2 ) System.err.println("ERROR IN NUMBER OF ARGUMENTS");
        if (args.length==1){
            System.out.println(GreetingGenerator.generateGreeting(args[0],Language.HUN));
        }
        if (args.length == 2){
            switch (args[1]){
                case "HUN":
                    System.out.println(GreetingGenerator.generateGreeting(args[0],Language.HUN));break;
                case "ENG":
                    System.out.println(GreetingGenerator.generateGreeting(args[0],Language.ENG));break;
                case "DE":
                    System.out.println(GreetingGenerator.generateGreeting(args[0],Language.DE));break;
                default:
                    System.err.println("UNKNOWN LANGUAGE WAS GIVEN");
            }
        }

    }
}