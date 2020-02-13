import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// RULES:
//  Any live cell with fewer than two live neighbours dies, as if by underpopulation.
//  Any live cell with two or three live neighbours lives on to the next generation.
//  Any live cell with more than three live neighbours dies, as if by overpopulation.
//  Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

public class GOLTester {
    @Test
    public void GOneStep1(){
        int[][] board = {{0,0,0,0,0},
                        {0,0,1,0,0},
                        {0,0,1,0,0},
                        {0,0,1,0,0},
                        {0,0,0,0,0}};
        int[][] exp = {{0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,1,1,1,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0}};

        GameOfLife t = new GameOfLife(board);
        t.oneStep();
        assertEquals(exp, t.getBoard());
    }

    @Test
    public void GOneStep2(){

    }
    @Test
    public void GOneStep3(){

    }
    @Test
    public void GOneStep4(){

    }
    @Test
    public void GOneStep5(){

    }

}
