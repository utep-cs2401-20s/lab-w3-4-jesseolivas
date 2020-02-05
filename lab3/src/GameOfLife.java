public class GameOfLife{
    int size;
    int[][] board;
    int[][] previous;

    public GameOfLife() {
    }

    // Constructor taking in the size wanted to be given to the
    // 2D array for both boards
    public GameOfLife(int size) {
        this.size = size;
        this.board = new int[size][size];
        this.previous = new int[size][size];
    }

    // Constructor taking in a 2D array and copies it into
    // previous
    public GameOfLife(int[][] b) {
        size = b.length;
        previous = new int[size][size];
        board = new int[size][size];
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                previous[i][j] = b[i][j];
            }
        }

    }

    // Returns the current board
    public int[][] getBoard() {
        return board;
    }

    // FIX ME
    public void oneStep(){

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
    public int[][] evolution(int n){
        return board;
    }

}