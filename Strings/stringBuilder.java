package Strings;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mithila");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(1, 'p');
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);
    }

}
