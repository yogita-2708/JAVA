import java.util.*;
import java.util.ArrayList;

public class SecondLargestMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> even = new <Integer>ArrayList();
        ArrayList<Integer> odd = new <Integer>ArrayList();
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even array ");
        for (int e : even)
            System.out.print(e + " ");
        System.out.println();
        System.out.println("sorted odd array ");
        for (int e : odd)
            System.out.print(e + " ");
        System.out.println();
        int evensec = even.get(even.size() - 2);
        int oddsec = odd.get(odd.size() - 2);
        System.out.println("Second Largest Element in Even List is:" + evensec);
        System.out.println("Second Largest Element in Odd List is:" + oddsec);
        System.out.println("Sum Of Second Largest Element Of Odd and Even List:" + (evensec + oddsec));
    }
}
