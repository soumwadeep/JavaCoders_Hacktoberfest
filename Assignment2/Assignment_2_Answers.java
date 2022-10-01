import java.util.Scanner;

class Sample {

    static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    qn1();
    qn2();
    qn3();
  }

  static void qn1() {
    int n, firstTerm = 0, secondTerm = 1;

    System.out.print("Enter a number: ");
    n = scan.nextInt();
    scan.nextLine();

    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
    scan.close();
  }

  static void qn2() {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
  }

  static void qn3() {
    System.out.print("Enter your mark: ");
    int mark = scan.nextInt();
    scan.nextLine();

    if(mark>=90)
        System.out.println("Outstanding");
    else if(mark >=80) 
        System.out.println("Excellent");
    else if(mark >= 70)
        System.out.println("Good");
    else if(mark >= 60)
        System.out.println("Average");
    else if(mark >=50 )
        System.out.println("Poor");
    else
        System.out.println("Fail");
  }
}