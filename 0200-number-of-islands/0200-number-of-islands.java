class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]!=1 && grid[i][j]=='1' ){
                    count++;
                    check(i,j,grid,vis);
                }
            }
        }
        return count;
    }
    void check(int i,int j,char[][]grid,int[][]vis){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return;
        }
        if(vis[i][j]==1 || grid[i][j]=='0'){
            return ;
        }
        vis[i][j]=1;

        check(i+1,j,grid,vis);
        check(i-1,j,grid,vis);
        check(i,j+1,grid,vis);
        check(i,j-1,grid,vis);
    }
}