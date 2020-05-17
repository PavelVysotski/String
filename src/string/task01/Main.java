package string.task01;

import java.util.Arrays;

public class Main {
    /*
    Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
    */
    public static void main(String[] args) {
        String title[] = {"сommandName", "epamSystems", "BrunuhVille", "ХочуРаботатьПрограммистом"};
        for ( String t : title ) {
            System.out.println(t);
        }

        for ( int i = 0; i < title.length; i++ ) {
            String str = title[i];
            for ( int j = 0; j < str.length(); j++ ) {
                char ch = str.charAt(j);
                if (Character.isUpperCase(ch)) {
                    String temp = str.substring(0, j).toLowerCase() + "_" + str.substring(j, j + 1).toLowerCase() + str.substring(j + 1);
                    str = temp;
                    if (str.charAt(0) == '_') {
                        title[i] = str.substring(0, 0) + str.substring(1);
                    } else
                        title[i] = str;
                }
            }
        }
        for ( String t : title ) {
            System.out.println(t);
        }
    }
}

