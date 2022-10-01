import java.util.Scanner;

public class Cal {
    public static void main(String arg[]){
        
        System.out.println("Enter two numbesrs:");
        Scanner sc= new Scanner(System .in);
      
            int n1= sc.nextInt();
            int n2= sc.nextInt();
            
        System.out.println("For addition press 1");
        System.out.println("For subtration press 2");
        System.out.println("For multiplication press 3");
        System.out.println("For division press 4");
        int key= sc.nextInt();


        switch(key){
            case 1: System.out.println("sum is "+(n1+n2));
            break;
            case 2:System.out.println("diff is "+(n1-n2));
            break;
            case 3:System.out.println(n1*n2);
            break;
            case 4:System.out.println(n1/n2);
            

        }
    }
    
}
