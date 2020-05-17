package string.task08;

public class Main {
    /*
    Проверить, является ли заданное слово палиндромом.
    */
    public static void main(String[] args) {
        String str1 = "Шалаш";
        StringBuilder reverse = new StringBuilder(str1);

        System.out.println(str1);
        System.out.println(reverse.reverse());

        if (str1.equalsIgnoreCase(reverse.toString()) == true) {
            System.out.println("Строка является палиндромом.");
        } else System.out.println("Строка не является палиндромом.");
    }
}
