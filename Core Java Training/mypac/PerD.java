package mypac ;
class Pac{
    String name ;
    int age;
    double sal;
    Pac(String n,int a,double s){
        name=n;
        age=a;
        sal=s;
    }
    void dis(){
        System.out.println("Name = "+name+"Age = "+age+"Sallary ="+sal);
    }
 }

    class PerD{
        public static void main(String args[]) {
            Pac p1=new Pac("Jarvis",16,1000000);
            p1.dis();

        }
    }
