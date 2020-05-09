package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectList {

    public List<String> createList(String string) {

        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", string.charAt(0), string.charAt(1), string.charAt(2));
        System.out.printf("| %c %c %c |\n", string.charAt(3), string.charAt(4), string.charAt(5));
        System.out.printf("| %c %c %c |\n", string.charAt(6), string.charAt(7), string.charAt(8));
        System.out.println("---------");

        String str1 = string.substring(0, 3);
        String str2 = string.substring(3, 6);
        String str3 = string.substring(6, 9);
        String str4 = string.substring(0, 1) + string.substring(3, 4) + string.substring(6, 7);
        String str5 = string.substring(1, 2) + string.substring(4, 5) + string.substring(7, 8);
        String str6 = string.substring(2, 3) + string.substring(5, 6) + string.substring(8, 9);
        String str7 = string.substring(0, 1) + string.substring(4, 5) + string.substring(8, 9);
        String str8 = string.substring(2, 3) + string.substring(4, 5) + string.substring(6, 7);

        return new ArrayList<>(Arrays.asList(str1, str2, str3, str4, str5, str6, str7, str8));
    }
}
