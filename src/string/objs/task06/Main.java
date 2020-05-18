package string.objs.task06;

public class Main {
    /*
    Из заданной строки получить новую, повторив каждый символ дважды
    */
    public static void main(String[] args) {
        String str = "повторить это";
        doubleStr(str);
    }

    public static String doubleStr (String str){
        char[] ch = str.toCharArray();
        char[] newCh = new char[2 * ch.length];
        int j = 0;

        for ( int i = 0; i < ch.length; i++ ) {
            newCh[j] = ch[i];
            newCh[j + 1] = ch[i];
            j += 2;
        }
        String newStr = new String(newCh);
        System.out.println(newStr);
        return newStr;
    }
}
