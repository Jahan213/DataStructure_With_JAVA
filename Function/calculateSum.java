package Function;

import java.util.*;

public class calculateSum {
    public static int calculateSumm(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSumm(a, b);
        System.out.println(sum);

    }

}
