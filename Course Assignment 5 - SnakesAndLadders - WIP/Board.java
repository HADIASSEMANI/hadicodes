public class Board {
    int[][] grid = new int[10][10];
    public Board(){}
    public Board(Board board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = i * 10 + (j+1);
            }
        }
    }
}
