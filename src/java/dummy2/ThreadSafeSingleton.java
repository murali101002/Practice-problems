/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

/**
 *
 * @author muralidhar
 */
public class ThreadSafeSingleton {
    //Lazy initialization
    private ThreadSafeSingleton instance = null;
    //Early initialization
    //private ThreadSafeSingleton instance = new ThreadSafeSingleton();
    private ThreadSafeSingleton() {

    }

    public ThreadSafeSingleton getInstance() {
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}
