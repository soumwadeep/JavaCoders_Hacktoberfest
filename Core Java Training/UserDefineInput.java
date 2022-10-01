import java.io.*;
public class UserDefineInput {
    public static void main(String args[])throws IOException
    {
        int a,b,sum;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the value:");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        sum=a+b;
        System.out.println("Result = "+sum);
    }    
}


/* 

this  all are seprator
    ()paranthesis
    {}brace
    []bracket
    ; semicolon
    ,comma
    .period


operator
    Arthmetic operator
    +
    _
    *
    /
    % modulus
    ++ increment
    -- decrement
    += adition assinment
    -+

relational
    ==
    !=
    >
    <
    >=
    <=

logical operator
     &&
     !
     ||
     ?: ternary oprator

*/
