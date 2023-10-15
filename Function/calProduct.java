package Function;

import java.util.*;

public class calProduct {
    public static int calculateProduct(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = calculateProduct(a, b);
        System.out.println("Product : " + multiply);

    }

}
