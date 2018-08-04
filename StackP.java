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
public class StackP {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch,temp;
        int flag=0;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
           if(ch=='(' || ch=='[' || ch=='{')
           {
              // System.out.println("Pushing "+ch);
               stack.push(ch);
               
           }
           else
           {
               if(!stack.empty())
               {
                   temp=(char)stack.pop();
                  // System.out.println("Poping "+temp);
                  switch(temp)
                  {
                      case '(':if(ch!=')')
                          flag=1;
                      break;
                      case '{':if(ch!='}')
                          flag=1;
                      break;
                      case '[':if(ch!=']')
                          flag=1;
                      break;
                      default:flag=1;
                  }
               }
               
               
           }
        }
        
        //int a=(int)stack.pop();
        if(flag==1)
        System.out.println("NO");
        else
            System.out.println("YES");
    }
    
}
