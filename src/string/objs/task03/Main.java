package string.objs.task03;

public class Main {
    /*
    Проверить, является ли заданное слово палиндромом.
    */
    public static void main(String[] args) {
        String str1 = "Шалаш";

        checkPalindrom(str1);
    }

    public static void checkPalindrom (String str1){
        StringBuilder reverse = new StringBuilder(str1);

        System.out.println(str1);
        System.out.println(reverse.reverse());

        if (str1.equalsIgnoreCase(reverse.toString())) {
            System.out.println("Строка является палиндромом.");
        } else System.out.println("Строка не является палиндромом.");
    }
}
