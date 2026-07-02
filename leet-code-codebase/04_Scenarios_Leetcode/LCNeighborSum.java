// Topic: LeetCode - 3242 Design Neighbor Sum Service (Basic Implementation)
public class LCNeighborSum {
    int[][] grid;
    int n;

    public LCNeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }
    
    public int adjacentSum(int value) {
        int sum = 0;
        int[] pos = findPos(value);
        if (pos[0] > 0) sum += grid[pos[0]-1][pos[1]];
        if (pos[0] < n-1) sum += grid[pos[0]+1][pos[1]];
        if (pos[1] > 0) sum += grid[pos[0]][pos[1]-1];
        if (pos[1] < n-1) sum += grid[pos[0]][pos[1]+1];
        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum = 0;
        int[] pos = findPos(value);
        if (pos[0] > 0 && pos[1] > 0) sum += grid[pos[0]-1][pos[1]-1];
        if (pos[0] > 0 && pos[1] < n-1) sum += grid[pos[0]-1][pos[1]+1];
        if (pos[0] < n-1 && pos[1] > 0) sum += grid[pos[0]+1][pos[1]-1];
        if (pos[0] < n-1 && pos[1] < n-1) sum += grid[pos[0]+1][pos[1]+1];
        return sum;
    }
    
    private int[] findPos(int value) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == value) return new int[]{i, j};
            }
        }
        return new int[]{0,0};
    }
}