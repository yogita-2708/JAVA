
import java.util.*;

public class ProductSmallestpair {
    public static int productSmallestPair(int arr[], int n, int sum) {
        if (n < 2)
            return -1;
        int temp, check;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        check = arr[0] + arr[1];
        if (check <= sum)
            return arr[0] * arr[1];
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum:  ");
        int sum = sc.nextInt();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(productSmallestPair(arr, n, sum));
    }
}
