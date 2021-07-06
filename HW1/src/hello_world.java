public class hello_world {
    public static void main(String[] args) {
        //System.out.println("Hello, World!" + args[0]);
        System.out.printf(String.format("Hello, %s World!", args[0]));
    }
}