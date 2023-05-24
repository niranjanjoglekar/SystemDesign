package DesignPatterns.SingletonDesignPattern;

/**
 * @author niranjanjoglekar on 24/05/23
 * Classical Java implementation of singleton design pattern
 */
public class ClassicSingleton {

    private static ClassicSingleton object;

    // Private constructor to force use of getInstance() to create Singleton object
    private ClassicSingleton() {};

    public static ClassicSingleton getInstance(){
        if (object==null)
            object = new ClassicSingleton();
        return object;
    }
}
