package string.objs.task10;

public class Main {
    /*
    Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    знаком. Определить количество предложений в строке X.
    */
    public static void main(String[] args) {
        String str = "Смеркалось. Завтра новый день! Снова писать код? Конечно же! :)";
        countSentense(str);
    }

    public static void countSentense (String s){
        int count = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Количество предложений: " + count);
    }
}
