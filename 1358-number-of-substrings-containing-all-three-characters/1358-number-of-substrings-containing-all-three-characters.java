class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int r=0;
        int max=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                max+=s.length()-r;
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            r++;
        }
        return max;
    }
}