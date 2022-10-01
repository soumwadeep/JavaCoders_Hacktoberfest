class Boxs {
    private double width;
    private double height;
    private double depth;
    Boxs(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double Volume(){
        return width*depth*height;
    }

    }
class Boxs2 extends Boxs{
    Boxs2(double w1,double h1,double d1){
        super(w1, h1, d1);

    }

    }
    class BoxSupper{
        public static void main(String args[]) {
            Boxs2 bs=new Boxs2(10,20,30);
            double vol;
            vol=bs.Volume();
            System.out.println("result =" +vol);

            
        }
    }

