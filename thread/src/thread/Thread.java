/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author student3
 */
class odd extends Thread {

    public void run() {
        try {
            int a = 1;
            for (int i = 1; i < 10; i++) {

                System.out.println("odd:" + a);
                Thread.sleep(1000);
                a += 2;
            }
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
}

class even extends Thread {

    public void run() {
        try {
            int a = 2;
            for (int i = 0; i < 10; i++) {

                System.out.println("odd:" + a);
                Thread.sleep(1000);
                a += 2;
            }
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
}

public class Thread {

    public static void main(String[] args) {
        odd t1 = new odd();
        even t2 = new even();
        t1.start();
        t2.start();
    }

}
