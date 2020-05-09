package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cells: ");
        String string = sc.nextLine().replace('_', ' ');
        char[] chars = string.toCharArray();
        List<String> list = new CollectList().createList(chars);

        String[] arrCoords = {"1 3", "2 3", "3 3", "1 2", "2 2", "3 2", "1 1", "2 1", "3 1",};

        boolean isTrue = true;
        while (isTrue) {
            System.out.print("Enter the coordinates: ");
            String inputCoord = sc.nextLine();
            try {
                if (Integer.parseInt(inputCoord.substring(0, 1)) > 3 ||
                        Integer.parseInt(inputCoord.substring(0, 1)) < 1 ||
                        Integer.parseInt(inputCoord.substring(2)) > 3 ||
                        Integer.parseInt(inputCoord.substring(2)) < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;

                }
            } catch (NumberFormatException ignored) {
                System.out.println("You should enter numbers!");
                continue;
            }
            for (int i = 0; i < arrCoords.length; i++) {
                if (arrCoords[i].equals(inputCoord)) {
                    if (chars[i] == ' ') {
                        chars[i] = 'X';
                        isTrue = false;
                        break;
                    } else if (chars[i] == 'X' || chars[i] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                        break;
                    }
                }
            }
        }


        new CollectList().createList(chars);


//        if ((new CheckO().check(list) && new CheckX().check(list)) || Difference.differenceOX(string)) {
//            System.out.println("Impossible");
//        } else if (new CheckX().check(list)) {
//            System.out.println("X wins");
//        } else if (new CheckO().check(list)) {
//            System.out.println("O wins");
//        } else if (!new CheckO().check(list) && !new CheckX().check(list) && !new Check_().check(string)) {
//            System.out.println("Draw");
//        } else if (new Check_().check(string)) {
//            System.out.println("Game not finished");
//        }
    }



}
