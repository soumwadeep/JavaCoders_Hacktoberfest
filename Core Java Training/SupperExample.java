class A{
    int i;
}
class B extends A{
    int i;
    B(int a,int b){
        super.i=a;
        i=b;
    }
    void disp(){
        System.out.println("I in A="+super.i);
        System.out.println("I in B="+i);
    }
}
public class SupperExample {
    public static void main(String args[]) {
        B b1= new B(10,20);
        b1.disp();
        
    }
    
}
