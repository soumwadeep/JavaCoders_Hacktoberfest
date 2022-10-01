class Pattern{
    public static void main(String args[]){
        for(int i=1;i<=8;i++){
            System.out.print("* ");
            if(i%2==0){
                System.out.println();
                continue;
            }
        }
    }
}