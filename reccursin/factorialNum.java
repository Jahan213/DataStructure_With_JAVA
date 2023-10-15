package reccursin;

public class factorialNum {
    public static int calFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_num1 = calFactorial(n - 1);
        int fact_n = n * fact_num1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calFactorial(n);
        System.out.println(ans);
    }

}
