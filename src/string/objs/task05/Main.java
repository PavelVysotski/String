package string.objs.task05;

public class Main {
    /*
    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    */
    public static void main(String[] args) {
        String str = "А сколько же тут букв ааа в строке, а?";

        countLetter(str);
    }

    public static int countLetter(String str) {
        str = str.toLowerCase();
        int count = 0;
        char[] ch = str.toCharArray();
        for ( int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == 'а') {
                count++;
            }
        }
        System.out.println("Количество букв 'а' в строке: " + count);
        return count;
    }
}
