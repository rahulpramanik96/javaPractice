
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
public class PrimeC {
   
    boolean chkprime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public int solve(int[] a, int b) {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(b%a[i]==0)
            {
                if(chkprime(a[i])){
                c++;
                System.out.println(a[i]);
                }
            }
            
        }
        return c;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
         //MaxSumContSubArray ob =new  MaxSumContSubArray();
         PrimeC ob=new PrimeC();
        int a=ob.solve(arr,486);
        System.out.println(a);
    }
}
    

