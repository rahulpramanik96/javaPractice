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

public class Anagrams {
     static int makeAnagram(String a, String b) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i,val,count=0;
        char ch;
        for(i=0;i<a.length();i++)
        {
            ch=a.charAt(i);
            if(map.containsKey(ch))
            {
               val=map.get(ch);
                val++;
                map.put(ch,val);
            }
            else
                map.put(ch,1);
        }
        for(i=0;i<b.length();i++)
        {
            ch=b.charAt(i);
            if(map.containsKey(ch))
            if(map.get(ch)>0)
            {
                count+=2;
                val=map.get(ch);
                val--;
                map.put(ch,val);
            }
            
        }
        return (a.length()+b.length()-count);
        


    }
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String a=sc.next();
         String b=sc.next();
         int n= makeAnagram(a,b);
         System.out.println(n);
     }

    
}
