package string.chararray.task05;

public class Main {
    /*
    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    Крайние пробелы в строке удалить.
    */
    public static void main(String[] args) {
        String str = "  Удалить в   строке     все          лишние    пробелы    . ";
        System.out.println(str);

        deleteSpace(str);
    }

    public static void deleteSpace(String str) {
        String newStr = str.trim();
        while (newStr.contains("  ")) {
            String temp = newStr.replaceAll("  ", " ");
            newStr = temp;
        }
        char ch = newStr.charAt(newStr.length()-2);
        if (ch == ' '){
            String newStr2 = newStr.substring(0,newStr.length()-2)+newStr.substring(newStr.length()-1);
            newStr=newStr2;
        }
        System.out.println(newStr);
    }
}
