package Assignment10;

import java.util.Scanner;

public class MyException2 extends Exception{
    MyException2(String s){
        super(s);
    }
}
class bonusOfSalary{
    public static void main(String[] args) throws MyException2 {
        System.out.print("Enter salary:");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if(salary>10000){
            float bonus = (10*salary)/100;
            System.out.println("Bonus of salary:" + " "+bonus);
        }else{
            throw new MyException2("Salary is too small for bonus");
        }
    }
}