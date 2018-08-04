
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
public class ArraySubSeqConstValue {
    int gcd(int a,int b)
    {
        if(a<b)
        return gcd(b,a);
        if(b==0)
        return a;
        else
        return gcd(b,a%b);
        
    }
    public int solve(int A, int B, int C, int D) {
        long count=0,i;
        long gcd=gcd(A,gcd(B,C));
        long min=Math.min(A,Math.min(B,C));
        int lcm=(int) (A*B*C/gcd);
       if(lcm<0 || lcm<A || lcm<B || lcm<C)
           lcm=D;
        System.out.println(lcm);
        long range=Math.min(lcm,D-1);
        //System.out.println("range is "+range);
        for(i=min;i<=range;i++){
            System.out.println("Heare");
        if(i%A==0 || i%B==0 || i%C==0)
        count++;
        }
        if(lcm<D)
        {
             long k=D/lcm;
             count=k*count;
             i=k*lcm+1;
             for(;i<D;i++)
             {
                  System.out.println("Heare "+i);
                 if(i%A==0 || i%B==0 || i%C==0)
                 count++;
             }
        }
        
        return (int) count;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int c=sc.nextInt();
       int k=sc.nextInt();
       
       // int arr[]=new int[n];
       
         //MaxSumContSubArray ob =new  MaxSumContSubArray();
         ArraySubSeqConstValue ob=new ArraySubSeqConstValue();
        int n=ob.solve(a,b,c,k);
      
        System.out.println(n);
        
}}
