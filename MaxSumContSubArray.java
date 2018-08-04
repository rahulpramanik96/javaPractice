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

public class MaxSumContSubArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
         MaxSumContSubArray ob =new  MaxSumContSubArray();
        int a=ob.calc(arr, n);
        System.out.println(a);
        
    }

    public MaxSumContSubArray() {
    }
    int calc(int arr[],int n)
    {
        int maxSofar=-99999,maxending=0;
        for(int i=0;i<n;i++)
        {
            maxending+=arr[i];
            if(maxending>maxSofar)
                maxSofar=maxending;
            if(maxending<0)
                maxending=0;
        }
        return maxSofar;
    
    }
    
}
