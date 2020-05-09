package tictactoe;

import java.util.Scanner;

public class Start {

    int count = 0;

    public void start(char[] chars) {

        CollectList collect = new CollectList();
        Scanner sc = new Scanner(System.in);
        String[] arrCoords = {"1 3", "2 3", "3 3", "1 2", "2 2", "3 2", "1 1", "2 1", "3 1"};

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
                        if (count % 2 == 0) {
                            chars[i] = 'X';
                            isTrue = false;
                            break;
                        } else {
                            chars[i] = 'O';
                            isTrue = false;
                            break;
                        }

                    } else if (chars[i] == 'X' || chars[i] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                        break;
                    }
                }
            }
            boolean b = collect.createList(chars);
            if (b) return;
        }

        count++;
        start(chars);
    }
}
