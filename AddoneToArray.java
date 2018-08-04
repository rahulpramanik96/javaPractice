
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
import java.util.*;
import java.io.*;

public class AddoneToArray {
    void solve(int arr[])
    {
        int flag=0,j=0;
        String nstr="";
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0 && flag==0)
            {
                //skip
            }
            else
            {
                flag=1;
                nstr+=String.valueOf(arr[i]);
               
            }
        }
        
            System.out.println(nstr);
            int carry=1;
            String str="";
        for(int i=nstr.length()-1;i>=0;i--)
        {
            int n=Integer.parseInt(String.valueOf(nstr.charAt(i)));
            n=n+carry;
            if(n>9)
            {
                str=(n%10)+str;
                carry=(n/10)%10;
            }
            else
            {
                str=n+str;
                carry=0;
            }
            
        }
        if(carry>0)
        {
            str=carry+str;
        }
        System.out.println(str);
        int a[]=new int[str.length()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
             System.out.println("Values"+a[i]);
        }
        
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
         //MaxSumContSubArray ob =new  MaxSumContSubArray();
         //QuickSort ob=new QuickSort();
        //ob.Quicksort(arr,0,arr.length-1);
        //for(int i=0;i<arr.length-1;i++)
        //System.out.println(arr[i]);
       AddoneToArray ob=new AddoneToArray();
       ob.solve(arr);
        
        // System.out.println(n);
        
    }
    
}
