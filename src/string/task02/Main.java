package string.task02;

public class Main {
    /*
    Замените в строке все вхождения 'word' на 'letter'.
    */
    public static void main(String[] args) {
        String str = "Many word is letter";
        System.out.println(str.replaceAll("word","letter"));

    }
}
