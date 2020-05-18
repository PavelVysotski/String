package string.chararray.task05;

public class Main {
    /*
    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    Крайние пробелы в строке удалить.
    */
    public static void main(String[] args) {
        String str = "  Удалить в   строке     все         лишние    пробелы  ";
        System.out.println(str);

        deleteSpace(str);
    }

    public static void deleteSpace(String str) {
        str = str.trim();
        while (str.contains("  ")) {
            String temp = str.replaceAll("  ", " ");
            str = temp;
        }
        System.out.println(str);
    }
}
