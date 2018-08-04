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
public class CountOnesInBinary {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0,max=0;
        String bin=Integer.toBinaryString(n);
        System.out.println(bin);
        bin+='0';
        for(int i=0;i<bin.length();i++)
        {
            char ch=bin.charAt(i);
            if(ch!='0')
                m++;
            else
            {
                if(m>max)
                    max=m;
                m=0;
            }
        }
        System.out.println(max);
    }
    
}
