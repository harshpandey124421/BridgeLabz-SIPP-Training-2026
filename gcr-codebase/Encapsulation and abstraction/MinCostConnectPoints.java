public class MinCostConnectPoints {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int cost = 0;
        boolean[] visited = new boolean[n];
        int[] minDist = new int[n];
        for (int i = 1; i < n; i++) {
            minDist[i] = Integer.MAX_VALUE;
        }
        
        for (int i = 0; i < n; i++) {
            int curr = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (curr == -1 || minDist[j] < minDist[curr])) {
                    curr = j;
                }
            }
            
            visited[curr] = true;
            cost += minDist[curr];
            
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    int dist = Math.abs(points[curr][0] - points[j][0]) + Math.abs(points[curr][1] - points[j][1]);
                    if (dist < minDist[j]) {
                        minDist[j] = dist;
                    }
                }
            }
        }
        return cost;
    }
}