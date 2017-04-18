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
public class ThreadDemo {

    public static void main(String[] args) {
        TestThread th = new TestThread("Hello");
        th.start();
        TestThread th2 = new TestThread("World");
        th2.start();
    }
}

class TestThread extends Thread {
    private String threadName;
    private Thread thread;
    TestThread(String name) {
        this.threadName = name;
        System.out.println("Creating theread -> "+name);
    }

    @Override
    public void run() {
        System.out.println("running - "+threadName);
        for(int i=0;i<5;i++){
            System.out.println(threadName+" "+i);
            try{
                System.out.println("Thread sleeping - "+threadName);
                thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread break - "+threadName);
                break;
            }
        }
        System.out.println("Thread exiting");
    }
    public void start(){
        System.out.println("Starting thread "+threadName);
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}
