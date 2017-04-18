/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

/**
 *
 * @author muralidhar
 */
public class SingletonClass {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton instSingleton = Singleton.getInstance();
        Singleton singleton2 = new Singleton();
        Singleton instSingleton2 = Singleton.getInstance();
        System.out.println(singleton.equals(singleton2));
        System.out.println(instSingleton.equals(instSingleton2));
    }
}
class Singleton{
    //below is lazy initialization which initializes when the class is called
    private static Singleton instance = null;
    //below is early initialization which initilizes as soon as the class is created
//    private static final Singleton instance = new Singleton();
    protected Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
