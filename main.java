public class main{
public static void main(String[] args) {
    GreetingsGenerator generator = new GreetingsGenerator();
    RenderService renderer = new RenderService();
    System.out.println(renderer.render (generator.GreetingsGenerator("Uram")));
    
}}  