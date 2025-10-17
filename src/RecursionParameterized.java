public class RecursionParameterized {
    public static void main(String[] args) {
        int n = 5;
        printSum(n, 0);
    }

    public static void printSum(int n, int sum){
        if(n<1){
            System.out.print("Sum: "+ sum);
            return;
        }
        printSum(n-1, sum+n);
    }
}
