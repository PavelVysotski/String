package string.objs.task07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    /*
    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
    def", то должно быть выведено "abcdef".
    */
    public static void main(String[] args) {
        String str = "abc cde def";
        String str2 = "fed edc cba";

        System.out.println(str + "| В алфавитном порядке:");
        deleteRepeatAndSpaceToAlphabet(str2);
        System.out.println(str + "| В нетронутом порядке:");
        deleteRepeat(deleteSpace(str));
        System.out.println(str2 + "| В нетронутом порядке:");
        deleteRepeat(deleteSpace(str2));
    }

    //Данный метод работает только, если надо сделать в алфавитном порядке.
    public static String deleteRepeatAndSpaceToAlphabet(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            sb.append(ch[0]);
            for ( int i = 1; i < ch.length; i++ ) {
                if (ch[i] != ch[i - 1]) {
                    sb.append(ch[i]);
                }
            }
        }
        String sbSub = sb.substring(1);
        System.out.println(sbSub);
        return str;
    }

    //Эти два метода реализовывают, если не в алфавитном порядке
    public static String deleteSpace(String str) {
        str = str.trim();
        while (str.contains(" ")) {
            String temp = str.replaceAll(" ", "");
            str = temp;
        }
        return str;
    }

    public static String deleteRepeat(String str) {

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean repeatedChar;
        for ( int i = 0; i < chars.length; i++ ) {
            repeatedChar = false;
            for ( int j = i + 1; j < chars.length; j++ ) {
                if (chars[i] == chars[j]) {
                    repeatedChar = true;
                    break;
                }
            }
            if (!repeatedChar) {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);
        return str;
    }
}

