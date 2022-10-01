import java.io.*;
public class Grade {
    public static void main(String args[])throws IOException
    {
        int sub1,sub2,sub3,total;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the Marks of three subjects:");
        sub1=Integer.parseInt(br.readLine());
        sub2=Integer.parseInt(br.readLine());
        sub3=Integer.parseInt(br.readLine());
        total=sub1+sub2+sub3;
        if(total>=240){
            System.out.println("Grade A");
        }
        else if(total >=180){
            System.out.println("Grade B");
        }
        else if(total>=120){
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail::Better luck next time");

        }
    }    
}



