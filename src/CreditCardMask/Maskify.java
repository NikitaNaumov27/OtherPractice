package CreditCardMask;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("1234Hello"));
    }
    public static String maskify(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 4)
            for (int i = 0; i < sb.length() - 4; i++)
                sb.setCharAt(i, '#');
        return sb.toString();
    }
}
