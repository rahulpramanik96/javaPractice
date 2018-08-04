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


public class ValidString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch;
        int val=1;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                val=map.get(ch);
                val++;
                map.put(ch, val);
            }
            else
                map.put(ch,1);
        }
        System.out.println(map);
        int flag=0;
        int f=0;
        Set keys=map.keySet();
        for(Object key : keys)
        {
            ch=(key.toString()).charAt(0);
            System.out.println(val-map.get(ch));
            if(Math.abs(val-map.get(ch))==1 )
                    {
                        if(flag==0)
                        flag=1;
                        else
                            f=1;
                    }
            else if((val-map.get(ch)>1) || (val-map.get(ch)<0))
            {
                if(val==1 || map.get(ch)==1)
                {
                    if(flag==0)
                    flag=1;
                    else
                        f=1;
                }
                else
                f=1;
               // System.out.print("Here");
            }
          
        }
        if(f==0)
            System.out.println("YES");
        else
             System.out.println("NO");
    }
    
}
