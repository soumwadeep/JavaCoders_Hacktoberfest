/*class Box {
    double width,height,depth,vol;
    void volume(){
        vol=width*height*depth;
        System.out.println("volume = "+ vol);

    }
    
}
class Box2{
    public static void main(String args[]) {
        Box b1= new Box();
        b1.width=10;
        b1.height=20;
        b1.depth=15;
        b1.volume();
        
    }
}
*/
class Box {
    double width,height,depth,vol;
    double volume(){
        return width*height*depth;
    }
    
}
class Box2{
    public static void main(String args[]) {
        Box b1= new Box();
        double vol;
        b1.width=10;
        b1.height=20;
        b1.depth=15;
        vol=b1.volume();
        System.out.println("volume = "+ vol);
        
    }
}