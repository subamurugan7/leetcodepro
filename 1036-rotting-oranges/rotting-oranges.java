class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]
        );
        int freshCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    pq.offer(new int[]{0, i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        int maxTime = 0;
        int[][] directions = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0];
            int r = cur[1];
            int c = cur[2];
            maxTime = Math.max(maxTime, time);
            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    freshCount--;
                    pq.offer(new int[]{time + 1, nr, nc});
                }
            }
        }
        return freshCount == 0 ? maxTime : -1;
    }
}