class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m= grid[0].length;
        int[][] vis = new int[n][m];
        int num = 0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j] == 0){
                    dfs(i,j,grid,vis);
                    num++;
                }
            }
        }
        return num; 
    }

    private void dfs(int r, int c, char[][]grid, int[][]vis){
        if(r<0 || c<0 || r>=grid.length|| c>= grid[0].length || vis[r][c]==1 || grid[r][c]=='0') return;
        vis[r][c]=1;
        int delRow[]= {1,0,-1,0};
        int delCol[]= {0,1,0,-1};
        for(int i=0;i<4;i++){
            dfs(r+delRow[i],c+delCol[i],grid,vis);
        }
    } 
}
