
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
 * This code is wrong
 */
public class MinDiff {
    int min=999999;
    int calc(int arr[],int i)
    {
        //System.out.println(min);
        
        if(i>=arr.length)
            return min;
        
        for(int k=i+1;k<arr.length;k++)
        {
            if(Math.abs(arr[i]-arr[k])<min)
                min=Math.abs(arr[i]-arr[k]);
        }
        return Math.min(min,calc(arr,i+1));
    }
    int calc2(int arr[])
    {
        int t;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                arr[i]=0;
            if(map.containsKey(arr[i]))
            {
                t=map.get(arr[i]);
                t++;
                map.put(arr[i],t);
            }
            else
                map.put(arr[i],1);
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
         //MaxSumContSubArray ob =new  MaxSumContSubArray();
         MinDiff ob=new MinDiff();
        int a=ob.calc(arr,0);
        
       /* for(int i:arr)
        {
            System.out.println(arr[i]);
        }*/
        System.out.println(a);
        
    }

    
}
