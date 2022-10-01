class Abc{
    Abc(){
   
        System.out.println("Abc");
    }}

class Xyz extends Abc{
    Xyz(){
        System.out.println("Xyz");
    }
   
}
class Bca extends Xyz{
    Bca(){
        System.out.println("Bca");
    }
   
}
public class ConstAccess {
    public static void main(String args[]) {
        Bca b1=new Bca();
        
    }
    
}
