package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        Result r = Result.LOSE;
        Move[][] movearray = {{Move.PAPER, Move.ROCK}, {Move.SCISSORS, Move.PAPER}, {Move.ROCK, Move.SCISSORS}};

        if(mine.equals(theirs)){
            r = Result.DRAW;
        }
        for(int i =0; i< movearray.length; i++){
            if(mine.equals(movearray[i][0])
             && theirs.equals(movearray[i][1])){
                r = Result.WIN;
            }
        }
        return r;

    }
}
