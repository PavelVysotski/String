package string.chararray.task04;

public class Main {
    /*
    В строке найти количество чисел.
    */
    public static void main(String[] args) {
        String str = "Дата рождения: 1983 год, 12 месяц, 15 число";
        countNumber(str);
    }

    public static int countNumber (String str){
        char[] ch = str.toCharArray();
        int countNumber = 0;
        for ( int i = 0; i < ch.length; i++ ) {
            if (Character.isDigit(ch[i])) {
                if (Character.isDigit(ch[i+1])) {
                    continue;
                } else
                    countNumber++;
            }
        }
        System.out.println("Чисел в строке " + "\"" + str + "\" - " + "равно " + countNumber);
        return countNumber;
    }
}
