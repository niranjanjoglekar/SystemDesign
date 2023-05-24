package DesignPatterns.SingletonDesignPattern;

/**
 * @author niranjanjoglekar on 24/05/23
 * Thread Synchronized Java implementation of singleton design pattern
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton object;

    private SynchronizedSingleton(){};

    // Only one thread can execute this at a time
    public static synchronized SynchronizedSingleton getInstance(){
        if(object==null){
            object = new SynchronizedSingleton();
        }
        return object;
    }
}
