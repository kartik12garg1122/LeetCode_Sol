class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        int a=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(a)){
                    return false;
                }
            }
            else{
                map.put(s.charAt(i),t.charAt(a));
            }
            if(map2.containsKey(t.charAt(a))){
                if(map2.get(t.charAt(a))!=s.charAt(i)){
                    return false;
                }
            }
            else{
                map2.put(t.charAt(a),s.charAt(i));
            }
            a++;
        }
        return true;
    }
}