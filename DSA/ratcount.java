//Rat Count House

import java.util.*;
class ratcount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rats:");
        int r = sc.nextInt();
        System.out.println("Enter the value of unit:");
        int unit = sc.nextInt();
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(counthouse(r,unit,arr,n));
        
    }

    public static int counthouse(int r, int unit, int arr[], int n)
    {
        if(arr == null)
            return -1;
        int count = 0;
        int sum = 0;
        int res = r * unit;

        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
            count++;
            if(sum >= res){
                break;
            }
        }
        if(sum < res){
            return 0;
        }
        return count;
    }
    
}