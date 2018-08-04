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

public class hashmapex {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Scanner str=new Scanner(s);
        HashMap<String,Integer> map=new HashMap<>();
        String temp;
        int val;
        System.out.println(s);
        while(str.hasNext())
        {
            //System.out.print("Print");
            temp=str.next();
            if(map.containsKey(temp))
            {
                val=map.get(temp);
                ++val;
                map.put(temp, val);
                        
            }
            else
            {
                map.put(temp,1);
            }
        }
        
        System.out.println(map);
    }
    
}
