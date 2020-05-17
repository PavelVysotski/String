package string.task06;

public class Main {
    /*
    Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    */
    public static void main(String[] args) {
        String str = "Найдите    максимальное       количество        пробелов подряд    ";
        char[] ch = str.toCharArray();
        int max = 0;
        int count = 0;

        for ( int i = 0; i < ch.length; i++ ) {
            if (Character.isSpaceChar(ch[i])) {
                count++;
            } else count = 0;
            if (count > max) {
                max = count;
            }
        }
        System.out.println("Максимальное кол-во пробелов подряд: " + max);
    }
}





