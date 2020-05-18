package string.objs.task09;

import javax.swing.plaf.basic.BasicMenuUI;

public class Main {
    /*
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    длинных слов может быть несколько, не обрабатывать.
    */
    public static void main(String[] args) {
        String str = "AbCdF Gh  IjK ooooOOOO";
        int upper = 0;
        int lower = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }
        System.out.println(upper + " " + lower);
    }
}
