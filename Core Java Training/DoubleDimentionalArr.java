/*public class DoubleDimentionalArr {
    public static void main(String args[]) {
        int i,j;
        int arr[][]={{10,12,34,15},{78,34,2,67},{23,87,45,34}};//declarition & initilization
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
          
        }
        
        
    }
    
}


public class DoubleDimentionalArr {
    public static void main(String args[]) {
        int i,j;
        int arr[][]=new int[4][5];
        arr[0][0]=2;
        arr[1][1]=5;
        arr[2][2]=7;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
          
        }
        
        
    }
    
}

public class DoubleDimentionalArr {
    public static void main(String args[]) {
        int i,j,k=0;
        int arr[][]=new int [4][5];
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                arr[i][j]=k;
                k++;}

            }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
          
        }
        
        
    }
    
}
*/
public class DoubleDimentionalArr {
    public static void main(String args[]) {
        int i,j,k=0;
        int arr[][]=new int [4][];
        arr[0]=new int[1];
        arr[1]=new int[2];
        arr[2]=new int[3];
        arr[3]=new int[4];
        for(i=0;i<4;i++){
            for(j=0;j<i+1;j++){
                arr[i][j]=k;
                k++;}

            }
        for(i=0;i<5;i++){
            for(j=0;j<i+1;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
          
        }
        
        
    }
    
}
