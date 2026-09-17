class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n=isConnected.length;
       int count=0;
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<isConnected[0].length;j++){
            if(isConnected[i][j]==1){
            adj.get(i).add(j);
            }
        }
       }
       int[]vis=new int[n];
       for(int i=0;i<adj.size();i++){
        if(vis[i]==0){
            count++;
            check(i,vis,adj);
        }
       }
       return count;
    }
    void check(int node,int[]vis,ArrayList<ArrayList<Integer>>adj){
        vis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==0){
                check(i,vis,adj);
            }
        }
    }
}