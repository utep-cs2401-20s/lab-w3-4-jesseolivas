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

    // Returns the current board
    public int[][] getBoard() {
        return board;
    }

    // Takes no parameter, void method
    // Transforms the current board into its next shape
    public void oneStep(){
        int[][] current = new int[size][size];
        for (int i = 0;i < current.length; i++){
            for(int j = 0; j < current[i].length; j++){
                current[i][j] = previous[i][j];
            }
        }
        for (int i = 0;i < current.length; i++){
            for(int j = 0; j < current[i].length; j++){
                if(current[i][j] == 1) {
                    if (neighbors(current[i][0], current[0][j]) < 2) {
                        current[i][j] = 0;
                    }
                    else if (neighbors(current[i][0], current[0][j]) > 3) {
                        current[i][j] = 0;
                    }
                }
                else {
                    if (neighbors(current[i][0], current[0][j]) == 3) {
                        current[i][j] = 1;
                    }
                }
            }
        }

    }

    // FIX ME
    // Takes two indices (row and column index)
    // Computes the number of neighbors the corresponding cell on the board has
    public int neighbors(int row, int col){
        int count = 0;
        if(previous[row-1][col-1] == 1){
            count++;
        }
        if(previous[row-1][col] == 1){
            count++;
        }
        if(previous[row-1][col+1] == 1){
            count++;
        }
        if(previous[row][col-1] == 1){
            count++;
        }
        if(previous[row][col+1] == 1){
            count++;
        }
        if(previous[row+1][col-1] == 1){
            count++;
        }
        if(previous[row+1][col] == 1){
            count++;
        }
        if(previous[row+1][col+1] == 1){
            count++;
        }
        return count;
    }

    // FIX ME
    // Takes int n, number of evolution steps needed to conduct
    // Transforms the board into the board after n steps of evolution
    // (n successive calls to oneStep)
    public void evolution(int n){
        for(int i = 0; i < n; i++){
            oneStep();
        }
    }

}