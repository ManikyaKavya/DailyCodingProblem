/*Implement a job scheduler which takes in a 
function f and an integer n,
 and calls f after n milliseconds.*/

import java.util.*;

class JobScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of milliseconds after which the function f must run");
        int seconds = sc.nextInt();
        sc.close();
        try {
            Thread.sleep(seconds);
            Function();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void Function() {
        System.out.println("Hello world");
    }
}