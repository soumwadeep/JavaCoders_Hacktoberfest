class Abc{
    int i,j;
    void sum(){
        int add=i+j;
        System.out.println("Result = "+add);
    }
}
class Xyz extends Abc{
    int k,add2;
    void sum2(){
        add2=i+j+k;
        System.out.println("Result = "+add2);
    }
   
}
public class inheritence {
    public static void main(String args[]) {
        Xyz x1= new Xyz();
        x1.i=10;
        x1.j=20;
        x1.k=30;
        x1.sum();
        x1.sum2();
    
        
    }
    
}


