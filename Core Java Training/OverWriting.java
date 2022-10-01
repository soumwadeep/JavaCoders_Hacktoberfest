class Parent{
    void PMethod(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void cMethod(){
        System.out.println("Child");
    }
    void PMethod(){
        System.out.println("Hello");
    }
}


public class OverWriting {
    
    public static void main(String args[]) {
        Child c1=new Child();
        c1.PMethod();
        c1.cMethod();

        
    }
}
