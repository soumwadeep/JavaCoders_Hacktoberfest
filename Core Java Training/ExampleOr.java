/*
//first code

class A{
    int i,j;
    A(int a,int b){
        i=a;
        j=b;
    }
    void disp(){
        System.out.println("i and j= "+i+" "+j);
    }

}
class B extends A{
    int k;
    B(int a,int b,int c){
        super(a,b);
        k=c;

    }
    void disp(){
        System.out.println("k ="+k);
    }
}

public class ExampleOr {
    public static void main(String args[]) {
        B b1=new B(10,20,30);
        b1.disp();

        
    }
    
}
*/

// code 2
class A{
    int i,j;
    A(int a,int b){
        i=a;
        j=b;
    }
    void disp(){
        System.out.println("i and j= "+i+" "+j);
    }

}
class B extends A{
    int k;
    B(int a,int b,int c){
        super(a,b);
        k=c;

    }
    void disp(){
        super.disp();
        System.out.println("k ="+k);
    }
}

public class ExampleOr {
    public static void main(String args[]) {
        B b1=new B(10,20,30);
        b1.disp();

        
    }
    
}

