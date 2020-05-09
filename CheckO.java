package tictactoe;

import java.util.List;

public class CheckO implements Check {

    @Override
    public boolean check(List<String> list) {
        return list.contains("OOO");
    }
}
