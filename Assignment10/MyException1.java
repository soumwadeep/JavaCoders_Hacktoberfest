package Assignment10;
import java.lang.*;
import java.util.Scanner;
public class MyException1 extends Exception {
    MyException1(String s){
        super(s);
    }
}
class {
    public static void main(String[] args) throws MyException1 {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<10){
            throw new MyException1("Number is too small");
        }
    }
}