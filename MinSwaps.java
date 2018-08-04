
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class MinSwaps {
    static int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
     static int find(int decimal_number)
    {
        if (decimal_number == 0) 
            return 0; 
             
        else
         
        return (decimal_number % 6 + 10 * 
                find(decimal_number / 6));
    }
    static void  derivedSeq(int arr[])
    {
        int d,num,pow;
        for(int i=0;i<arr.length;i++)
        {
           
            d= find(arr[i]);
            arr[i]=sum(d);
        }
    }
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
     }
    static int minimumSwaps(int[] arr) {
         int swap=0,small,i,temp,pos;
        MinSwaps ob=new MinSwaps();
        int a[]=new int[arr.length];
        for(i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
            
        }
        //ob.Quicksort(a,0,a.length-1);
        Arrays.sort(a);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        int j=0;
        for(i=0;i<arr.length;i++)
        {
           // small=arr[i];
            pos=map.get(a[j]);
            j++;
            /*for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<small)
                {
                    pos=j;
                    small=arr[j];
                }
            }*/
            if(arr[pos]!=arr[i])
            {
                System.out.println("Swapping "+i+" "+pos);
                System.out.println("Swapping "+arr[i]+" "+arr[pos]);
                temp=arr[i];
                map.put(temp,pos);
            arr[i]=arr[pos];
            map.put(arr[pos],i);
            arr[pos]=temp;
            
            
                swap++;
            
            }
            
        }
        return swap;


    }
    static int c=0;
	/* This method sorts the input array and returns the
	number of inversions in the array */
	static int mergeSort(int arr[], int array_size)
	{
		int temp[] = new int[array_size];
		return _mergeSort(arr, temp, 0, array_size - 1);
	}
	
	/* An auxiliary recursive method that sorts the input array and
	returns the number of inversions in the array. */
	static int _mergeSort(int arr[], int temp[], int left, int right)
	{
	int mid, inv_count = 0;
	if (right > left)
	{
		/* Divide the array into two parts and call _mergeSortAndCountInv()
		for each of the parts */
		mid = (right + left)/2;
	
		/* Inversion count will be sum of inversions in left-part, right-part
		and number of inversions in merging */
		inv_count = _mergeSort(arr, temp, left, mid);
		inv_count += _mergeSort(arr, temp, mid+1, right);
	
		/*Merge the two parts*/
		inv_count += merge(arr, temp, left, mid+1, right);
	}
	return inv_count;
	}
	
	/* This method merges two sorted arrays and returns inversion count in
	the arrays.*/
	static int merge(int arr[], int temp[], int left, int mid, int right)
	{
	    //System.out.println("Mid is "+mid);
	int i, j, k;
	int inv_count = 0;
	
	i = left; /* i is index for left subarray*/
	j = mid; /* j is index for right subarray*/
	k = left; /* k is index for resultant merged subarray*/
	while ((i <= mid - 1) && (j <= right))
	{
		if (arr[i] <= arr[j])
		{
		temp[k++] = arr[i++];
		}
		else
		{
		temp[k++] = arr[j++];
	    
	    c+=mid-i;
		/*this is tricky -- see above explanation/diagram for merge()*/
		inv_count = inv_count + (mid - i);
		}
	}
	
	/* Copy the remaining elements of left subarray
	(if there are any) to temp*/
	while (i <= mid - 1)
		temp[k++] = arr[i++];
	
	/* Copy the remaining elements of right subarray
	(if there are any) to temp*/
	while (j <= right)
		temp[k++] = arr[j++];
	
	/*Copy back the merged elements to original array*/
	for (i=left; i <= right; i++)
		arr[i] = temp[i];
	
	return inv_count;
	}

     public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String k;
        int n=Integer.parseInt(br.readLine());
        
        int arr[]=new int[n];
        
        k=br.readLine();
        String str=br.readLine();
       
        
       
        str.trim();
        String s[]=str.split(",");
        for(int i=0;i<s.length;i++)
        {
            try
            {
                arr[i]=Integer.parseInt(s[i]);
            }
            catch(Exception e)
            {
                
            }
        }
            
        
         //MaxSumContSubArray ob =new  MaxSumContSubArray();
         //QuickSort ob=new QuickSort();
        //ob.Quicksort(arr,0,arr.length-1);
        //for(int i=0;i<arr.length-1;i++)
        //System.out.println(arr[i]);
       
        MinSwaps ob=new MinSwaps();
        derivedSeq(arr);
        
         n = mergeSort(arr,arr.length);
         System.out.println(n);
        
    }

    
}
