/*import java.io.*;
public class NeatedFor {
    public static void main(String args[])throws IOException{
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println("\n");

        }
    }
    
}
 // new patt

public class NeatedFor {
    public static void main(String args[]){
        for(int i=0;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");

        }
    }
    
}


public class NeatedFor {
    public static void main(String args[]){
        int rows = 5;
       
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
              System.out.print("*");
            }
            System.out.println();
          }
        }
      }

  */
  public class NeatedFor {

    public static void main(String[] args) {
      int rows = 5;
  
      for (int i = rows; i >= 1; --i) {
        for (int j = 1; j <= i; ++j) {
          System.out.print(j + " ");
        }
        System.out.println();
      }
    }
  }