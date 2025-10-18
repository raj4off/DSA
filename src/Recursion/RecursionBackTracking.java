package Recursion;
public class RecursionBackTracking {

    public static void main(String[] args){
        int n = 5;
        printBackTrack(n);
    }

    public static void printBackTrack(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printBackTrack(n-1);
    }
}