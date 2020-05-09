package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        char[] chars = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("---------");

        Start start = new Start();
        start.start(chars);
    }
}
