import java.io.*;
public class OddEven {
    public static void main(String args[])throws IOException
    {
        int num;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the value:");
        num=Integer.parseInt(br.readLine());
        if(num%2==0)
        {
            System.out.println(num +" is a even number");
        }
        else
        {
            System.out.println(num +" is a odd number");

        }
        
    }    
}

