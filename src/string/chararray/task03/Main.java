package string.chararray.task03;

public class Main {
    /*
    В строке найти количество цифр.
    */
    public static void main(String[] args) {
        String str = "How many digits: 12345";

        countDigit(str);
    }

    public static int countDigit (String str){
        char[] ch = str.toCharArray();
        int digit = 0;
        for ( int i = 0; i < ch.length; i++ ) {
            if (Character.isDigit(ch[i])) {
                digit++;
            }
        }
        System.out.println("В строке " + "\"" + str + "\" - " + digit + " цифр(ы).");
        return digit;
    }
}
