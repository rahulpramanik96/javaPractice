


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
public class CodeVita2 {
     static final int MAX = 256;
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String t=str;
        int n=sc.nextInt();
        int i;
        String s[]=new String[n];
        int pos[]=new int[n];
        for(i=0;i<n;i++)
        {
            s[i]=sc.next();
            pos[i]=sc.nextInt();
        }
        String nstr="",wrd="";
        int a;
        for(i=0;i<n;i++)
        {
            if(s[i].equalsIgnoreCase("r"))
            {
                a=pos[i];
                 if(a>str.length())
                a=a%(str.length());
                nstr=str.substring(str.length()-a)+str.substring(0,str.length()-a);
               // System.out.println(nstr);
            }
            else
            {
                 a=pos[i];
                  if(a>str.length())
                a=a%(str.length());
                nstr=str.substring(a)+str.substring(0,a);
                //System.out.println(nstr);
                
            }
            str=nstr;
            wrd=wrd+str.charAt(0);
           
        }
       //checkAnagram(wrd,t); 
       CodeVita2 ob=new CodeVita2();
       ob.search(wrd,t);
        
    }
      void search(String pat, String txt)
    {
        int flag=0;
        int M = pat.length();
        int N = txt.length();
 
       
        char[] countP = new char[MAX];
        char[] countTW = new char[MAX];
        for (int i = 0; i < M; i++)
        {
            (countP[pat.charAt(i)])++;
            (countTW[txt.charAt(i)])++;
        }
 
       
        for (int i = M; i < N; i++)
        {
            if (compare(countP, countTW))
            {
                flag=1;
                break;
            }
           
            (countTW[txt.charAt(i)])++;
 
            countTW[txt.charAt(i-M)]--;
        }
 
       
        if (compare(countP, countTW))
            {
                flag=1;
                
            }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
      static boolean compare(char arr1[], char arr2[])
    {
        for (int i = 0; i < MAX; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
      /*
    static void checkAnagram(String str1,String str2)
    {
        HashMap<Character,Integer> map1=new HashMap<>();
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
         int flag=0;
        if(str1.length()!=str2.length())
            flag=1;
         int i,val;
         char ch;
         for(i=0;i<str1.length();i++)
         {
             ch=str1.charAt(i);
              if(map1.containsKey(ch))
            {
                val=map1.get(ch);
                ++val;
                map1.put(ch, val);
                        
            }
            else
            {
                map1.put(ch,1);
            }
         }
         
         
         for(i=0;i<str2.length();i++)
         {
             ch=str2.charAt(i);
              if(map1.containsKey(ch))
            {
                val=map1.get(ch);
                 if(val<=0)
                {
                    flag=1;
                    
                    break;
                }
                 else
                 {
                --val;
               
                map1.put(ch, val);
                 }
                        
            }
            else
            {
                
                 flag=1;
                    break;
            }
         }
         if(flag==0)
             System.out.println("YES");
         else
            System.out.println("NO"); 
        
    }*/
    
}
