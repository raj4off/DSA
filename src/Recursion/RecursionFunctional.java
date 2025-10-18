package Recursion;
public class RecursionFunctional {
    public static void main(String[] args) {
        System.out.print("Sum: "+printSum(4));
    }

    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        return (n+ printSum(n-1));
    }
}
