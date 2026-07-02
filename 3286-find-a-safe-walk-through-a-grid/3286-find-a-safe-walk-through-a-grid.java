

class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        
        // Track the minimum health lost to reach each cell
        int[][] minHealthLost = new int[m][n];
        for (int[] row : minHealthLost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // 0-1 BFS using ArrayDeque
        Deque<int[]> deque = new ArrayDeque<>();
        
        // Initialize start position (0, 0)
        minHealthLost[0][0] = grid.get(0).get(0);
        deque.offerFirst(new int[]{0, 0});
        
        // Direction vectors for moving up, down, left, right
        int[] dirs = {-1, 0, 1, 0, -1};
        
        while (!deque.isEmpty()) {
            int[] curr = deque.pollFirst();
            int r = curr[0];
            int c = curr[1];
            
            // If we reached the destination, check if remaining health is positive
            if (r == m - 1 && c == n - 1) {
                return (health - minHealthLost[r][c]) > 0;
            }
            
            // Explore 4-directional neighbors
            for (int i = 0; i < 4; i++) {
                int nr = r + dirs[i];
                int nc = c + dirs[i + 1];
                
                // Bounds check
                if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                    int cost = grid.get(nr).get(nc);
                    int nextCost = minHealthLost[r][c] + cost;
                    
                    // If a healthier path to (nr, nc) is found
                    if (nextCost < minHealthLost[nr][nc]) {
                        minHealthLost[nr][nc] = nextCost;
                        
                        // 0-1 BFS push strategy
                        if (cost == 0) {
                            deque.offerFirst(new int[]{nr, nc}); // 0-cost moves go to the front
                        } else {
                            deque.offerLast(new int[]{nr, nc});  // 1-cost moves go to the back
                        }
                    }
                }
            }
        }
        
        return (health - minHealthLost[m - 1][n - 1]) > 0;
    }
}
