/*
public class ForLoop {
    public static void main(String agrs[]) {
        int i;
        for(i=1;i<=10;i++){
            
            System.out.println(i);
        }
        
    }
}
*/

import java.io.*;
public class ForLoop {
    

    public static void main(String args[])throws IOException
    {
        int num,i,count=0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter your number:");
        num=Integer.parseInt(br.readLine());
        for(i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;

            }
        }
        if(count==0){
            System.out.println("its a prime number");
        
        }
        else{
            System.out.println("its not a prime number");
        }
    }
}

