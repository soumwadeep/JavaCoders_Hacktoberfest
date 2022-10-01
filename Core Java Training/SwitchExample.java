/*
import java.io.*;
public class SwitchExample {
    

    public static void main(String args[])throws IOException
    {
        int val,a,b,res;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Press 1 for Addition:");
        System.out.println("Press 2 for Addition:");
        System.out.println("Press 3 for Addition:");
        System.out.println("Press 4 for Addition:");
        System.out.println("Enter your Choice:");
        val=Integer.parseInt(br.readLine());
        System.out.println("Enter two value:");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        
        
        switch(val){
            case 1:res=a+b;
                System.out.println("Result = "+res);
                break;
            case 2:res=a-b;
                System.out.println("Result = "+res);
                break;
            case 3:res=a*b;
                System.out.println("Result = "+res);
                break;
            case 4:res=a/b;
                System.out.println("Result = "+res);
                break;
            default :
                System.out.println("invalid input:: Better luck next time");
        }
        

        }
        
       
}
    
*/
 // improved program:
import java.io.*;
public class SwitchExample {
    

    public static void main(String args[])throws IOException
    {
        int val,a,b,res;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Press 1 for Addition:");
        System.out.println("Press 2 for Addition:");
        System.out.println("Press 3 for Addition:");
        System.out.println("Press 4 for Addition:");
        System.out.println("Enter your Choice:");
        val=Integer.parseInt(br.readLine());
        
        
        switch(val){
            case 1:System.out.println("Enter two value:");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            res=a+b;
                System.out.println("Result = "+res);
                break;
            case 2:System.out.println("Enter two value:");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            res=a-b;
                System.out.println("Result = "+res);
                break;
            case 3:System.out.println("Enter two value:");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            res=a*b;
                System.out.println("Result = "+res);
                break;
            case 4:System.out.println("Enter two value:");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            res=a/b;
                System.out.println("Result = "+res);
                break;
            default :
                System.out.println("invalid input:: Better luck next time");
        }
        

        }
        
       
}