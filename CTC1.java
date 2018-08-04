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
public class CTC1 {
     /*Function to left rotate arr[] of siz n by d*/
    int leftRotate(List<Integer> l1, int d, int n) 
    {
        //int arr2[]=new int[arr.length];
        System.out.println(l1.size());
        int i, j, k, temp,max,pos;
       /* for(i=0;i<arr.length;i++)
            arr2[i]=arr[i];*/
        
        for (i = 0; i < gcd(d, n); i++) 
        {
            /* move i-th values of blocks */
            temp = l1.get(i);
            j = i;
            while (true) 
            {
                k = j + d;
                if (k >= n) 
                    k = k - n;
                if (k == i) 
                    break;
                l1.add(j,l1.get(k));
                //arr2[j] = arr2[k];
                j = k;
            }
            l1.add(j, temp);
           // arr2[j] = temp;
        }
        max=l1.get(0);
       // max=arr2[0];
        pos=0;
        for(i=1;i<l1.size();i++)
        {
            if(l1.get(i)>max){
                max=l1.get(i);
                pos=i;
            }
        }
        System.out.println(max+" "+pos+" ");
        return pos;
    }
     int gcd(int a, int b) 
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int i;
         List<Integer> a=new ArrayList<Integer>();
          List<Integer> rotate=new ArrayList<Integer>();
        // int a[]=new int[n];
         for(i=0;i<n;i++)
             a.add(sc.nextInt());
         
          int m=sc.nextInt();
        // int rotate[]=new int[n];
         for(i=0;i<m;i++)
             rotate.add(sc.nextInt());
         
         CTC1 ob =new CTC1();
          for(i=0;i<m;i++)
          {
              int k=rotate.get(i);
              if(rotate.get(i)>=a.size())
                 k%=a.size();
                  
               ob.leftRotate(a,k,a.size());
          }
        
         
         
         
     }
    
}
