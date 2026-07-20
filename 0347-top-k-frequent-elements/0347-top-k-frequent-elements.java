class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]ans=new int[k];
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        q.addAll(map.keySet());

        for(int i=0;i<k;i++){
            int val=q.poll();
            ans[i]=val;
        }
        //System.gc();
        return ans;
    }
}