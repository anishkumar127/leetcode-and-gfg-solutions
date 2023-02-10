class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        
        Queue<Integer> positions = new LinkedList<>();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    positions.add(i*n+j);
                }
            }
        }

        if (positions.size() == 0 || positions.size() == n*n) return -1;


        int maxDist = 1;
        while (!positions.isEmpty()) {
            int cur = positions.poll();
            int x = cur/n;
            int y = cur%n;
            maxDist = Math.max(maxDist, grid[x][y]);
            if (x-1 >=0 && grid[x-1][y] == 0) {
                grid[x-1][y] = grid[x][y]+1;
                positions.add((x-1)*n+y);
            }

            if (y-1 >=0 && grid[x][y-1]==0) {
                grid[x][y-1] = grid[x][y]+1;
                positions.add((x)*n+(y-1));
            }

            if (x+1 < n && grid[x+1][y] == 0) {
                grid[x+1][y] = grid[x][y] +1;
                positions.add((x+1)*n+y);
            }

            if (y+1 < n && grid[x][y+1] == 0) {
                grid[x][y+1] = grid[x][y] + 1;
                positions.add((x)*n+(y+1));
            }
        }
        return maxDist-1;
    }
}