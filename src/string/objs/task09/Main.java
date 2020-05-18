package string.objs.task09;

import javax.swing.plaf.basic.BasicMenuUI;

public class Main {
    /*
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    длинных слов может быть несколько, не обрабатывать.
    */
    public static void main(String[] args) {
        String str = "АА бб ВВ гг AA bb CC dd АБВГabcd";
        kindLetter(str);
    }
    public static void kindLetter (String s) {
        int upper = 0;
        int lower = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }
        System.out.println("Прописных: "+upper + ", Строчных: " + lower);
    }
}
