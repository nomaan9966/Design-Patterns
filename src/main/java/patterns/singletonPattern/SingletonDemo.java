package patterns.singletonPattern;

public class SingletonDemo {
    public static void main(String[] args) {
        // Get the single instance of the Singleton class
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Check if both references point to the same instance
        System.out.println(singleton1 == singleton2); // Should print true
    }
}
