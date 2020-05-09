package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cells: ");
        String string = sc.nextLine();

        List<String> list = new CollectList().createList(string);

        if ((new CheckO().check(list) && new CheckX().check(list)) || Difference.differenceOX(string)) {
            System.out.println("Impossible");
        } else if (new CheckX().check(list)) {
            System.out.println("X wins");
        } else if (new CheckO().check(list)) {
            System.out.println("O wins");
        } else if (!new CheckO().check(list) && !new CheckX().check(list) && !new Check_().check(string)) {
            System.out.println("Draw");
        } else if (new Check_().check(string)) {
            System.out.println("Game not finished");
        }
    }



}
