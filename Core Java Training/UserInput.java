import java.io.*;
public class UserInput {
    public static void main(String args[])throws IOException
    {
        String name;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter your name :");
        name=br.readLine();
        System.out.println("Hello ::" +name+ " Sir");


    }
    
}

