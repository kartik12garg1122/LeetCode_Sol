class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>ch=new HashMap<>();
        for(char c2:s.toCharArray()){
            if(ch.containsKey(c2)){
                ch.put(c2,ch.get(c2)+1);
            }
            else{
                ch.put(c2,1);
            }
        }
        PriorityQueue<Character>q=new PriorityQueue<>((a,b)->ch.get(b)-ch.get(a));

        q.addAll(ch.keySet());

        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            char c=q.poll();
            int count=ch.get(c);
            while(count>0){
                sb.append(c);
                count--;
            }
        }
        return sb.toString();
    }
}