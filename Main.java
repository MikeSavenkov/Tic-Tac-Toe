package tictactoe;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cells: ");
        String string = sc.nextLine();


        System.out.println("---------");
        System.out.println("| " + string.charAt(0) + " " + string.charAt(1) + " " + string.charAt(2) + " |");
        System.out.println("| " + string.charAt(3) + " " + string.charAt(4) + " " + string.charAt(5) + " |");
        System.out.println("| " + string.charAt(6) + " " + string.charAt(7) + " " + string.charAt(8) + " |");
        System.out.println("---------");

        String str1 = string.substring(0, 3);
        String str2 = string.substring(3, 6);
        String str3 = string.substring(6, 9);
        String str4 = string.substring(0, 1) + string.substring(3, 4) + string.substring(6, 7);
        String str5 = string.substring(1, 2) + string.substring(4, 5) + string.substring(7, 8);
        String str6 = string.substring(2, 3) + string.substring(5, 6) + string.substring(8, 9);
        String str7 = string.substring(0, 1) + string.substring(4, 5) + string.substring(8, 9);
        String str8 = string.substring(2, 3) + string.substring(4, 5) + string.substring(6, 7);

        List<String> list = new ArrayList<>(Arrays.asList(str1, str2, str3, str4, str5, str6, str7, str8));


        if ((checkO(list) && checkX(list)) || differenceOX(string)) {
            System.out.println("Impossible");
        } else if (checkX(list)) {
            System.out.println("X wins");
        } else if (checkO(list)) {
            System.out.println("O wins");
        } else if (!checkO(list) && !checkX(list) && !check_(string)) {
            System.out.println("Draw");
        } else if (check_(string)) {
            System.out.println("Game not finished");
        }
    }

    static boolean checkX(List<String> list) {
        return list.contains("XXX");
    }

    static boolean checkO(List<String> list) {
        return list.contains("OOO");
    }

    static boolean check_(String string) {
        return string.contains("_");
    }

    static boolean differenceOX(String string) {
        int countX = (int) string.chars().filter(x -> x == 'X').count();
        int countO = (int) string.chars().filter(x -> x == 'O').count();

        return Math.abs(countO - countX) > 1;
    }

}
