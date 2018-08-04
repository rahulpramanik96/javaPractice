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
import java.lang.*;
import java.io.*;
public class StringRotate {
    /*package whatever //do not write package name here */

    static void check(String s1,String s2)
    {
        int flag=0;
        if(s1.length()==s2.length())
        {
            System.out.println(s1);
            for(int i=0;i<s1.length();i++)
            {
                String nstr="";
                nstr=s1.substring(s1.length()-1-i)+s1.substring(0,s1.length()-i-1);
                //System.out.println(nstr);
                if(nstr.equals(s2))
                {
                    flag=1;
                     System.out.println("1");
                    break;
                    
                }
            }
            if(flag==0)
            System.out.println("0");
        }
        System.out.println("0");
    }
	public static void main (String[] args) throws IOException {
	    //Scanner sc=new Scanner(System.in);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine());
	    for(int i=0;i<n;i++){
	    String s1=br.readLine();
	    String s2=br.readLine();
            System.out.println("Here goes you output\n\n S1 is "+s1+"\n\n S2 is "+s2);
	    check(s1,s2);
	    }
		//code
	}
}
    

