package hu.nye.progtech.homework2;

public class GreetingGenerator {
    public static String generateGreeting(String name, Language lang) {
        StringBuilder sb = new StringBuilder();
        switch (lang) {
            case HUN:
                sb.append("Szia, ");
                break;
            case DE:
                sb.append("Gruess, ");
                break;
            default:
                sb.append("Hello, ");
                break;
        }
        sb.append(name);
        sb.append(" ");
        return sb.toString();
    }
}