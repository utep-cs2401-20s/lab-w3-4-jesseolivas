public class GameOfLife{
    int size;
    int[][] board;
    int[][] previous;

    public GameOfLife() {
    }

    public GameOfLife(int[][] board) {
        this.board = board;
    }

    //FIX ME
    public GameOfLife(int size) {
        this.size = size;
        this.board = new int[size][size];
    }

    //FIX ME
    public int[][] getBoard() {
        return board;
    }

    //FIX ME
    public void oneStep(){

    }

    //FIX ME
    public int neighbors(int a, int b){
        return 0;
    }

    //FIX ME
    public int[][] evolution(int n){
        return board;
    }

}