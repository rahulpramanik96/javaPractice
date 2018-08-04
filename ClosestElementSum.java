
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul Pramanik
 */
public class ClosestElementSum {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
         //MaxSumContSubArray ob =new  MaxSumContSubArray();
         //QuickSort ob=new QuickSort();
        //ob.Quicksort(arr,0,arr.length-1);
        //for(int i=0;i<arr.length-1;i++)
        //System.out.println(arr[i]);
       ClosestElementSum ob=new ClosestElementSum();
        // whatFlavors(arr,k);
        // System.out.println(n);
        int a=ob.sumClosest(arr, x, k);
        System.out.println(a);
    }
     int sumClosest(int arr[],int x,int k)
     {
         int a[][]=new int[arr.length][2];
         for(int i=0;i<arr.length;i++)
         {
             a[i][0]=arr[i];
             a[i][1]=i;
         }
         for(int i=0;i<arr.length;i++)
         {
             a[i][0]=Math.abs(arr[i]-x);
         }
         int sum=0,temp;
        // int min=a[0];
         for(int i=0;i<a.length;i++)
         {
             for(int j=0;j<a.length-i-1;j++)
             {
                 if(a[j][0]>a[j+1][0])
                 {
                     temp=a[j][0];
                     a[j][0]=a[j+1][0];
                     a[j+1][0]=temp;
                     temp=a[j][1];
                     a[j][1]=a[j+1][1];
                     a[j+1][1]=temp;
                 }
             }
         }
          for(int i=0;i<a.length;i++)
             {
                 System.out.println(a[i][0]);
             }
           System.out.println("\n");
             for(int i=0;i<k;i++)
             {
                 System.out.println(arr[a[i][1]]);
               sum+=arr[a[i][1]];
             }
            
         
         return sum;
     }
    
}
