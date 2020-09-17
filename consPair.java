/*cons(a, b) constructs a pair,
and car(pair) and cdr(pair) returns the first and last element 
of that pair.*/

import java.util.*;
 class Pair<T> {

    private int a;
    private int b;

    public Pair(int a, int b) {
        this.a=a;
        this.b=b;
	}

    public void getCarValue() {
        System.out.println("car(cons): "+a);
    }
    public void getCdrValue() {
        System.out.println("cdr(cons): "+b);
    }


}
public class consPair<T> {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Pair<Integer> cons = new Pair<Integer>(a,b);
        car(cons);
        cdr(cons);
        
    }

    private static void car(Pair<Integer> cons) {
        cons.getCarValue();
    }
    private static void cdr(Pair<Integer> cons) {
        cons.getCdrValue();
    }
}
