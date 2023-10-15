package patterns;

public class rotedHalf {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // space loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // loop for star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
