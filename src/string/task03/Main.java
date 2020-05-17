package string.task03;

public class Main {
    /*
    В строке найти количество цифр.
    */
    public static void main(String[] args) {
        String str = "Hundred is 100";
        char[] ch = str.toCharArray();
        int digit = 0;

        for ( int i = 0; i < ch.length; i++ ) {
            if (Character.isDigit(ch[i])) {
                digit++;
            }
        }
        System.out.println("В строке " + "\"" + str + "\" - " + digit + " цифр(ы).");
    }
}
