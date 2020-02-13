public class TorusGameOfLife extends GameOfLife{

    // RULES:
    //  Any live cell with fewer than two live neighbours dies, as if by underpopulation.
    //  Any live cell with two or three live neighbours lives on to the next generation.
    //  Any live cell with more than three live neighbours dies, as if by overpopulation.
    //  Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

    public TorusGameOfLife() {
    }

    // Constructor taking in the size wanted to be given to the
    // 2D array for both boards
    public TorusGameOfLife(int size) {
        super(size);
    }

    // Constructor taking in a 2D array and copies it into
    // previous
    public TorusGameOfLife(int[][] b) {
        super(b);
    }

    // FIX ME
    // Takes two indices (row and column index)
    // Computes the number of neighbors the corresponding cell on the board has
    @Override
    public int Neighbors(int row, int col){
        int count = 0;
        if(previous[((row-1) + size)% size][((col) + size)% size] == 1){
            count++;
        }
        if(previous[((row-1) + size)% size][((col-1) + size)% size] == 1){
            count++;
        }
        if(previous[((row-1) + size)% size][((col+1) + size)% size] == 1){
            count++;
        }
        if(previous[((row) + size)% size][((col-1) + size)% size] == 1){
            count++;
        }
        if(previous[((row) + size)% size][((col+1) + size)% size] == 1){
            count++;
        }
        if(previous[((row+1) + size)% size][((col-1) + size)% size] == 1){
            count++;
        }
        if(previous[((row+1) + size)% size][((col) + size)% size] == 1){
            count++;
        }
        if(previous[((row+1) + size)% size][((col+1) + size)% size] == 1){
            count++;
        }

        return count;
    }


}