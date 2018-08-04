
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
public class InversionPairs {
    static int c=0;
    static void merge(int arr[],int l,int r,int mid)
    {
        
        int n1=mid-l,i,j,k;
        int n2=r-mid+1;
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        System.out.println("A1 has ");
        for(i=0;i<n1;i++)
        {
            System.out.print(arr[l+i]+" ");
            a1[i]=arr[l+i];
        }
        System.out.println("A2 has ");
         for(i=0;i<n2;i++)
        {           
            System.out.print(arr[mid+i]+" ");
            a2[i]=arr[mid+i];
        }
         i=0;
         j=0;
         k=l;
         while(i<n1 && j<n2)
         {
             if(a1[i]<=a2[j])
             {
                 arr[k]=a1[i];
                 k++;
                 i++;
                
             }
             else if(a1[i]>a2[j])
             {
                 System.out.println("Swapping "+mid+" "+i);
                 arr[k++]=a2[j++];
                 c+=mid-i+1;
             }
             
         }
         while(i<n1)
         {
             arr[k++]=a1[i++];
         }
         while(j<n2)
         {
             arr[k++]=a2[j++];
         }
    }
    static void MergeSort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            merge(arr,l,r,mid);
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
         InversionPairs ob=new InversionPairs();
        ob.MergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        
        System.out.println("Inversion "+c);
        
    }
}
