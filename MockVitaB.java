/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul Pramanik
 */
import java.io.*;
import java.util.*;
public class MockVitaB {
    
    public int bdig(int n)
    {
        int no=0;
        String str=Integer.toBinaryString(n);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
                no++;
        }
       // System.out.println(no+"  "+str);
        return no;
    }
   // void swap(int arr[],int a,int b)
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        MockVitaB ob=new MockVitaB();
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt(),k,temp,inver=0;
        int[] arr=new int[n];
         //sc.useDelimiter(",");
         String t=br.readLine();
         String a[]=t.split(",");
        for(int i=0;i<n;i++)
        {
            k=Integer.parseInt(a[i]);
            arr[i]=ob.bdig(k);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
            if(arr[j]>arr[j+1])
            {
                System.out.println(arr[i]+" "+arr[j]);
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                inver++;
            }
            }
        }
        System.out.println(inver);
       // ob.bdig(11);
    }
}
