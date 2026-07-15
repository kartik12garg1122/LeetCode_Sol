class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        //String[]str=s.split("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        //char count='';
        for(char ch:map.keySet()){
            if(map.get(ch)==1){
                return s.indexOf(ch);
            }
        }
        return -1;
    }
}