public class MatrixOperations {
    public static int[][] create(int r, int c) {
        int[][] m = new int[r][c];
        for(int i=0; i<r; i++) for(int j=0; j<c; j++) m[i][j] = (int)(Math.random()*10);
        return m;
    }
    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++) for(int j=0; j<a[0].length; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }
    public static int[][] mul(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for(int i=0; i<a.length; i++) for(int j=0; j<b[0].length; j++) for(int k=0; k<a[0].length; k++)
            res[i][j] += a[i][k] * b[k][j];
        return res;
    }
    public static void main(String[] args) {
        int[][] m1 = create(2,2);
        int[][] m2 = create(2,2);
        add(m1, m2);
    }
}