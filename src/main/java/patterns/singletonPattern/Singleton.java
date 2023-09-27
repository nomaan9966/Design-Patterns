package patterns.singletonPattern;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code, if any
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the Singleton class can be defined here
}
