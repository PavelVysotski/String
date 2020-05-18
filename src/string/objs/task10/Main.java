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

    public static void countSentense (String str){
        int count = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Количество предложений: " + count);
    }
}
