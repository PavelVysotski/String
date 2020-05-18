package string.chararray.task02;

public class Main {
    /*
    Замените в строке все вхождения 'word' на 'letter'.
    */
    public static void main(String[] args) {
        String str = "Many letter is word";
        System.out.println(str.replaceAll("word","letter"));

    }
}
