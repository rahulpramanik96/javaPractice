
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

public class QuickSort {
    
      int partition(int arr[],int r,int p)
     {
         int x=arr[p],temp;
         int i=r-1;
         for(int j=r;j<p;j++)
         {
             if(arr[j]<x)
             {
                 i++;
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 
             }
         }
         i++;
         temp=arr[i];
         arr[i]=arr[p];
         arr[p]=temp;
         return i;
     }
     void Quicksort(int arr[],int r,int p)
     {
         if(r<p)
         {
             int q=partition(arr,r,p);
             Quicksort(arr,r,q-1);
             Quicksort(arr,q+1,p);
         }
     } public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
         //MaxSumContSubArray ob =new  MaxSumContSubArray();
         QuickSort ob=new QuickSort();
        ob.Quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length-1;i++)
        System.out.println(arr[i]);
        
    }
    
}
