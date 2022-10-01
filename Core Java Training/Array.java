/*public class Array {
    public static void main(String args[]) {
        int arr[]={10,7,8,2,6};
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        i++;
    }
        
    }
    
}


public class Array {
    public static void main(String args[]) {
        int arr[]=new int[6];
        arr[0]=12;
        arr[3]=15;
        arr[5]=18;
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        
    }
        
    }
}



public class Array {
    public static void main(String args[]) {
        char arr[]={'a','b','c','d'};
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        ;
    }
        
    }
    
}

*/
import java.io.*;
public class Array {
    public static void main(String args[])throws IOException {
        int arr[]=new int[6];InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the 5 value:");
        for(int j=0;j<=5;j++){
        arr[j]=Integer.parseInt(br.readLine());}
        for(int i=0;i<=arr.length;i++){
        System.out.println(" so the array is:"+arr[i]);
        
    }
        
    }
}










