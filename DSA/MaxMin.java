//Maximum and minimum element in an array

import java.util.*;

public class MaxMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
    int maxele = arr[0], minele = arr[0];
    for(i=0;i<n;i++){
        if(arr[i]>maxele)
        {
            maxele=arr[i];
        }
        if(arr[i]<minele)
        {
            minele=arr[i];
        }
    }    
    System.out.println("Maximum element:" + maxele);
    System.out.println("Minimum element:" + minele);
    }
}