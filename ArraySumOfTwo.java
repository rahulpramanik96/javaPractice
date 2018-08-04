

import java.util.Arrays;
import java.util.HashMap;
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
public class ArraySumOfTwo {
     static int search(int arr[],int s)
    {
       
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==s){
                arr[i]=0;
                break;
            }
               
        }
        return i;
    }

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        int i,j,flag=0;
        int pos[]=new int[cost.length];
        //HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<cost.length;i++)
        {
            //map.put(cost[i],i);
            pos[i]=cost[i];
        }
        Arrays.sort(cost);
        
        i=0;
        j=cost.length-1;
        while(i<j)
        {
            if(cost[i]+cost[j]>money)
                j--;
            else if(cost[i]+cost[j]<money)
                i++;
            else
            {
                flag=1;
                break;
            }
        }
        int min,max,a,b;
        a=search(pos,cost[i])+1;
        b=(search(pos,cost[j])+1);
        min=Math.min(a,b);
        max=Math.max(a,b);
        if(flag==1)
            System.out.println(min+" "+max);


    }

       public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
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
       
         whatFlavors(arr,k);
        // System.out.println(n);
        
    }


    
}
