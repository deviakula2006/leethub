class Solution {

    boolean dfs(char[][] grid, boolean[][] vis, int i, int j, int pi, int pj){
        
        vis[i][j] = true;

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        for(int d=0; d<4; d++){
            int ni = i + dx[d];
            int nj = j + dy[d];

            if(ni<0 || nj<0 || ni>=grid.length || nj>=grid[0].length)
                continue;

            if(grid[ni][nj] != grid[i][j])
                continue;

            if(!vis[ni][nj]){
                if(dfs(grid, vis, ni, nj, i, j))
                    return true;
            }
            else if(ni!=pi || nj!=pj){
                return true;
            }
        }

        return false;
    }

    public boolean containsCycle(char[][] grid) {

        boolean[][] vis = new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(!vis[i][j]){
                    if(dfs(grid, vis, i, j, -1, -1))
                        return true;
                }

            }
        }

        return false;
    }
}