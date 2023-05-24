package DesignPatterns.SingletonDesignPattern;

/**
 * @author niranjanjoglekar on 24/05/23
 * Double-Checked Locking based Java implementation of singleton design pattern
 */
public class DoubleLockingSingleton {

    private static DoubleLockingSingleton object = null;

    private DoubleLockingSingleton(){};

    public static DoubleLockingSingleton getInstance(){
        if(object==null){
            // To make thread safe
            synchronized (DoubleLockingSingleton.class){
                // check again as multiple threads can reach above step
                if(object==null){
                    object = new DoubleLockingSingleton();
                }
            }
        }
        return object;
    }
}
