package string.objs.task07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    /*
    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
    def", то должно быть выведено "abcdef".
    */
    public static void main(String[] args) {
        String str = " aab bbc c cdef fff  ";

        deleteRepeatAndSpace(str);
    }

    public static String deleteRepeatAndSpace (String str){
        StringBuilder sb = new StringBuilder();
        if(!str.isEmpty()) {
            char[]chars = str.toCharArray();
            Arrays.sort(chars);

            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i]!= chars[i - 1]) {
                    sb.append(chars[i]);
                }
            }
        }
        System.out.println(sb);
        return str;
    }
}

