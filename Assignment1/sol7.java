class Pattern{
    public static void main(String args[]){
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j%2);
        }
        System.out.println("\n");
       }
       for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j%2);
        }
        System.out.println("\n");
       }
    }
}