class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int[]arr=new int[n];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        for(int cards: deck){
            int index=q.poll();
            arr[index]=cards;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return arr;
    }
}