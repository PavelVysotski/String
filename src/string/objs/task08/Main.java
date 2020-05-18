package string.objs.task08;

public class Main {
    /*
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    длинных слов может быть несколько, не обрабатывать.
    */
    public static void main(String[] args) {
        String str = "Найти самое длинное слово в предложении и вывести его на экран.";

        longWord(str);
    }
    public static void longWord (String str){
        String[] strings = str.split(" ");
        String max = "";
        for ( String word : strings ) {
            if (word.length() > max.length()) {
                max = word;
            }
        }
        System.out.println(max);
    }
}
