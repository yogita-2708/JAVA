// To print fibonacci series: 0 1 1 2 3 5...(A number is the sum of previous 2 numbers).
import java.util.*;
public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int a=0,b=1;
        System.out.println(a+" ");
        if(n>1) {
            //find nth term
            for(int i=2;i<=n;i++) {
                System.out.println(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    }
}
