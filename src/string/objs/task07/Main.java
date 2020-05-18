package string.objs.task07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    /*
    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
    def", то должно быть выведено "abcdef".
    */
    public static void main(String[] args) {
        String str = " ffaccab bbc c cdef fff  ";

        deleteRepeatAndSpace(str);
    }

    public static String deleteRepeatAndSpace (String str){ //Метод работает только если надо сделать в алфавитном порядке.
        StringBuilder sb = new StringBuilder();             
        if(!str.isEmpty()) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            sb.append(ch[0]);
            for (int i = 1; i < ch.length; i++) {
                if (ch[i]!= ch[i - 1]) {
                    sb.append(ch[i]);
                }
            }
        }
        System.out.println(sb);
        return str;
    }
}

