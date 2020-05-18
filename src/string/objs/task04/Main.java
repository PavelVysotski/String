package string.objs.task04;

public class Main {
    /*
    С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    */
    public static void main(String[] args) {
        String s = "информатика";
        char[] ch = s.toCharArray();
        String str1 = "";
        String str2 = "";

        System.out.println(str1.copyValueOf(ch, 7,1)+str2.copyValueOf(ch,3,2)+
                str1.copyValueOf(ch,7,1));
    }
}
