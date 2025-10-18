package Recursion;
public class RecursionMultipleRecursion {
    public static void main(String[] args) {
        System.out.print(findFibonacci(4));
    }

    public static int findFibonacci(int n){
        if(n<=1) return n;
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}

//java -cp out src/Recursion/RecursionMultipleRecursion.java
