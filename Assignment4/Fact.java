class Fact{
    int ans = 1;
    public static int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        int factm = factorial(n-1);
        int ans = factm*n;
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of"+" "+n+" "+"is"+" "+factorial(n));
    }
}
