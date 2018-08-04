
import java.util.HashMap;
import java.util.Scanner;

// JAVA Code for Maximum size square sub-matrix with all 1s
class GFG
{
    // method for Maximum size square sub-matrix with all 1s
    static void printMaxSubSquare(int M[][])
    {
        int i,j;
        int R = M.length;         //no of rows in M[][]
        int C = M[0].length;     //no of columns in M[][]
        int S[][] = new int[R][C];     
         
        int max,pos, max_i=0, max_j=0; 
       
       
      for(j=0;j<C;j++)
      {
           if(M[0][j] == 1) 
           {
               if(j==0)
                   S[0][j]=M[0][j+1]+M[0+1][j+1]+M[0+1][j];
               else if(j==(C-1))
                   S[0][j]=M[0][j-1]+M[0+1][j-1]+M[0+1][j];
               else
                   S[0][j]=M[0][j+1]+M[0+1][j+1]+M[0+1][j]+M[0][j-1]+M[0+1][j-1];
           }
                    
                    //S[0][j] = M[i-1][j-1]+M[i-1][j+1]+M[i-1][j]+M[i][j-1]+M[i][j+1]+M[i+1][j+1]+M[i+1][j]+M[i+1][j-1];
                else
                    S[0][j] = 0;
           
            if(M[R-1][j] == 1) 
           {
               if(j==0)
                   S[R-1][j]=M[R-1][j+1]+M[R-2][j+1]+M[R-2][j];
               else if(j==(C-1))
                   S[R-1][j]=M[R-1][j-1]+M[R-2][j-1]+M[R-2][j];
               else
                   S[R-1][j]=M[R-1][j+1]+M[R-2][j+1]+M[R-2][j]+M[R-1][j-1]+M[R-2][j-1];
           }
                    
                    //S[0][j] = M[i-1][j-1]+M[i-1][j+1]+M[i-1][j]+M[i][j-1]+M[i][j+1]+M[i+1][j+1]+M[i+1][j]+M[i+1][j-1];
                else
                    S[R-1][j] = 0;
      }
      
      
         for(i=1;i<R-1;i++)
      {
           if(M[i][0] == 1) 
           {
               
                   S[i][0]=M[0][i+1]+M[i-1][0]+M[0+1][i+1]+M[0+1][i-1]+M[0+1][i];
           }
                    
                    //S[0][j] = M[i-1][j-1]+M[i-1][j+1]+M[i-1][j]+M[i][j-1]+M[i][j+1]+M[i+1][j+1]+M[i+1][j]+M[i+1][j-1];
                else
                    S[i][0] = 0;
           
            if(M[i][C-1] == 1) 
           {
              
                   S[C-1][i]=M[i-1][C-1]+M[i+1][C-1]+M[i+1][C-2]+M[i][C-2]+M[i-1][C-2];
           }
                    
                    //S[0][j] = M[i-1][j-1]+M[i-1][j+1]+M[i-1][j]+M[i][j-1]+M[i][j+1]+M[i+1][j+1]+M[i+1][j]+M[i+1][j-1];
                else
                    S[i][C-1] = 0;
      }
   
        for(i = 1; i < R-1; i++)
        {
            for(j = 1; j < C-1; j++)
            {
                
                if(M[i][j] == 1) 
                    
                    S[i][j] = M[i-1][j-1]+M[i-1][j+1]+M[i-1][j]+M[i][j-1]+M[i][j+1]+M[i+1][j+1]+M[i+1][j]+M[i+1][j-1];
                else
                    S[i][j] = 0;
            }    
        }   
       
         int val;
         HashMap<Integer,Integer> map=new HashMap<>();
         max=S[0][0];pos=0;
         for( i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                 if(map.containsKey(S[i][j]))
            {
                val=map.get(S[i][j]);
                if((i+j)==val)
                map.put(S[i][j], -1996);
                else
                {
                     map.put(S[i][j],Math.min((i+j),val));
                }      
            }
            else
            {
                map.put(S[i][j],(i+j));
            }
                if(S[i][j]>max)
                {
                    
                    max=S[i][j];
                    max_i=i;
                    max_j=j;
                    pos=i+j;
                }
               
            }
        }
         
         if(map.get(max)==-1996)
             System.out.println("Polygamy not allowed");
        else if(max==0)
              System.out.println("No suitable girl found");
         else
             System.out.println((max_i+1)+":"+(1+max_j)+":"+max);
         
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j;
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        GFG ob=new GFG();
        printMaxSubSquare(arr);
        
       
    }
}