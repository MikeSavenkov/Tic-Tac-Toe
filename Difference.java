package tictactoe;

public class Difference {

    static boolean differenceOX(String string) {

        int countX = (int) string.chars().filter(x -> x == 'X').count();
        int countO = (int) string.chars().filter(x -> x == 'O').count();
        return Math.abs(countO - countX) > 1;
    }
}
