package reccursin;

public class print1to5 {
    public static void printNumber(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }

    public static void main(String[] args) {
        int n = 0;
        printNumber(n);
    }

}
