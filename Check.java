
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

public class Check {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         int h=Integer.parseInt(s.substring(0,2));
        String m=(s.substring(3,5));
        String sec=(s.substring(6,8));
        String t=s.substring(8);
        
        int flag=0;
        String hh="";
        
        if(t.equals("PM"))
        {
            if(h==12)
            {
                
            }
            else
                h+=12;
            
        }   
        else
        {
            if(h==12)
            {
               // System.out.println("Here");
                hh="00";
                flag=1;
            }
                
        }
        if(flag==0)
        {
            hh=Integer.toString(h);
            if(h<10)
            {
                
                hh='0'+hh;
                
            }
            
        }
        String r=hh+":"+m+":"+sec;
        System.out.println(r);
       
    }
    
}
