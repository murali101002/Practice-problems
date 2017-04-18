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
public class CanWeOverrideStaticMethods {

    public static void main(String[] args) {
        Screen.show();
        subScreen.show();
        SubScreen screen = new SubScreen();
        

    }

    static class Screen {

        static void show() {
            System.out.println("From Parent class");
        }
    }

    static class subScreen extends Screen {

        //super();
        static void show() {
            System.out.println("From child class");
        }
    }
}

class Screen {
    void Screen(){
        System.out.println("From Parent class constructor no params");
    }
    void Screen(String args){
        System.out.println("From Parent class constructor 1 params");
    }

    void show(String ans) {
        System.out.println("From outer Parent class");
    }
    void show(String ans, String ques){
        System.out.println("From outer Parent 2 class");
    }
}
class SubScreen extends Screen{
    void Screen(String args,String tigs){
        System.out.println("From Parent class constructor no params");
    }
    void show(String ans, String ques, String abc){
        System.out.println("From outer child class");
    }
}
