
import java.util.*;
import java.text.DecimalFormat;
 
public class Pound {
    
   public static void main(String[] args)
   {
      double amount;
      double rupee, dollar, pound, euro, yen, ringgit, dirham;
      int choice;
 
      DecimalFormat f=new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("[=========which courency you convert currency=========]:");
      System.out.println("Enter 1: Ruppe");
      System.out.println("Enter 2: Dollar");
      System.out.println("Enter 3: Pound");
      System.out.println("Enter 4: Euro");
      System.out.println("Enter 5: Yen");
      System.out.println("Enter 6: Dirham");
      System.out.println("Enter 7: Ringgit");
 
      System.out.print("\nChoose from above options: ");
      choice = sc.nextInt();
 
      System.out.println("Enter the amount you want to convert?");
      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1 -> {
             // Ruppe Conversion
             dollar = amount / 75.92;
             System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
             
             pound = amount / 98.83;
             System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
             
             euro = amount / 82.57;
             System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
             
             yen = amount / 0.62;
             System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
             
             ringgit = amount / 17.98;
             System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
             
             dirham = amount / 20.67;
             System.out.println(amount + " Rupee = " + f.format(dirham) + " dirham");
           }
 
         case 2 -> {
             // Dollar Conversion
             rupee = amount * 75.92;
             System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
             
             pound = amount *0.77;
             System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
             
             euro = amount *0.92;
             System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
             
             yen = amount *124.30;
             System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
             
             ringgit = amount *4.22;
             System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
             
             dirham = amount *3.67;
             System.out.println(amount + " Dollar = " + f.format(dirham) + " dirham");
           }
 
         case 3 -> {
             // Pound Conversion2
             rupee = amount * 98.83;
             System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
             
             dollar = amount *1.30;
             System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
             
             euro = amount *1.20;
             System.out.println(amount + " pound = " + f.format(euro) + " Euro");
             
             yen = amount *161.82;
             System.out.println(amount + " pound = " + f.format(yen) + " Yen");
             
             ringgit = amount *5.50;
             System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
             
             dirham = amount *4.78;
             System.out.println(amount + " pound = " + f.format(dirham) + " dirham");
           }
 
         case 4 -> {
             // Euro Conversion
             rupee = amount * 82.57;
             System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
             
             dollar = amount *1.09;
             System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
             
             pound = amount *0.84;
             System.out.println(amount + " euro = " + f.format(pound) + " Pound");
             
             yen = amount *135.13;
             System.out.println(amount + " euro = " + f.format(yen) + " Yen");
             
             ringgit = amount *4.59;
             System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
             
             dirham = amount *3.99;
             System.out.println(amount + " euro = " + f.format(dirham) + " dirham");
           }
 
         case 5 -> {
             // Yen Conversion
             rupee = amount *0.61;
             System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
             
             dollar = amount *0.0080;
             System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
             
             pound = amount *0.0062;
             System.out.println(amount + " yen = " + f.format(pound) + " Pound");
             
             euro = amount *0.0074;
             System.out.println(amount + " yen = " + f.format(euro) + " Euro");
             
             
             ringgit = amount *0.034;
             System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
             
             dirham = amount *0.030;
             System.out.println(amount + " yen = " + f.format(dirham) + " dirham");
           }
         
         case 6 -> {
             // Dirham conversion
             rupee = amount *20.67;
             System.out.println(amount + " dirham = " + f.format(rupee) + " Ruppes");
             
             dollar = amount *0.27;
             System.out.println(amount + " dirham = " + f.format(dollar) + " Dollar");
             
             pound = amount *0.21;
             System.out.println(amount + " dirham = " + f.format(pound) + " Pound");
             
             euro = amount *0.25;
             System.out.println(amount + " dirham = " + f.format(euro) + " Euro");
             
             yen = amount *33.84;
             System.out.println(amount + " dirham = " + f.format(yen) + " yen");
             
             ringgit = amount *1.15;
             System.out.println(amount + " dirham = " + f.format(ringgit) + " ringgit");
         }
 
         case 7 -> {
             // Ringgit Conversion
             rupee = amount *17.98;
             System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");
             
             dollar = amount *0.24;
             System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");
             
             pound = amount *0.18;
             System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");
             
             euro = amount *0.22;
             System.out.println(amount + " ringgit = " + f.format(euro) + " euro");
             
             yen = amount *29.43;
             System.out.println(amount + " ringgit = " + f.format(yen) + " yen");
             
             dirham = amount *0.87;
             System.out.println(amount + " ringgit = " + f.format(dirham) + " dirham");
           }
         // default case
         default -> System.out.println("Invalid Input");
      }
       
          }
}
