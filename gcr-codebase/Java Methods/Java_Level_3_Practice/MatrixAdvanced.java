public class MatrixAdvanced {
    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for(int i=0; i<m.length; i++) for(int j=0; j<m[0].length; j++) t[j][i] = m[i][j];
        return t;
    }
    public static int det2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}};
        System.out.println(det2x2(m));
    }
}