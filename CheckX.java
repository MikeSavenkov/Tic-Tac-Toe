package tictactoe;

import java.util.List;

public class CheckX implements Check {

    @Override
    public boolean check(List<String> list) {
        return list.contains("XXX");
    }
}
