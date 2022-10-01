package mypac ;
class Per{
    String name ;
    int age;
    double sal;
    Per(String n,int a,double s){
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
            Per p1=new Per("Jarvis",16,1000000);
            p1.dis();

        }
    }
    

