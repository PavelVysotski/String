package string.objs.task02;

public class Main {
    /*
    В строке вставить после каждого символа 'a' символ 'b'.
    */
    public static void main(String[] args) {

        String str = "aaaa aaa aa a";
        System.out.println(str.replaceAll("a","ab"));
    }

}
