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
public class CharHashMap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        char ch;
        String res;
        s2.trim();
        int flag=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(!(map.containsValue(ch)))
                map.put(ch,1);
            
        }
        for(int i=0;i<s2.length();i++)
        {
            ch=s2.charAt(i);
            if(map.containsKey(ch))
            {
                flag=1;
                System.out.println("I am ");
                break;
            }
        }
        if(flag==1)
            res="YES";
        else
            res="NO";
        System.out.println(map);
        System.out.println(res);
    }
}
