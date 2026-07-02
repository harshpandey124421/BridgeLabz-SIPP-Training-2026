public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int r = board.length;
        int c = board[0].length;
        int[] neighbors = {-1, 0, 1};
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int liveNeighbors = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (!(neighbors[x] == 0 && neighbors[y] == 0)) {
                            int row = i + neighbors[x];
                            int col = j + neighbors[y];
                            if ((row >= 0 && row < r) && (col >= 0 && col < c) && (Math.abs(board[row][col]) == 1)) {
                                liveNeighbors++;
                            }
                        }
                    }
                }
                if ((board[i][j] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = -1;
                }
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1;
                } else if (board[i][j] < 0) {
                    board[i][j] = 0;
                }
            }
        }
    }
}