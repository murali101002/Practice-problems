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
public class PrintNaturalSequenceWithMultiThreading {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 50; i += 2) {
                    synchronized (lock) {
                        System.out.print(i + " ");
                        try {
                            lock.notify();
                            if(i==50) break;
                            lock.wait();
                        } catch (Exception e) {
                        }

                    }
                }
            }
        });
        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 50; i += 2) {
                    synchronized (lock) {
                        System.out.print(i + " ");
                        try {
                            lock.notify();
                            lock.wait();
                            
                        } catch (Exception e) {
                        }
                    }
                }
            }
        });
        even.start();
        odd.start();
    }
}
