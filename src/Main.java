public class Main {
    public static void main(String[] args)
    {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("Привет мир");
    }

    public static class HelloWorld
    {
        public HelloWorld()
        {
            System.out.println("Hello world!");
        }
    }
}
