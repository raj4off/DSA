public class RecursionZero {

    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println("Printing numbers in reverse from " + n);
        printReverse(n);
    }

    /**
     * Prints numbers from n down to 1 recursively.
     * @param n The starting number.
     */
    public static void printReverse(int n) {
        if(n == 0) return;
        System.out.print(n+" ");
        printReverse(n-1);
    }
}
