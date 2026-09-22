class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int[]hash=new int[256];
        int max=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]!=1){
                hash[s.charAt(r)]=1;
                
                max=Math.max(max,r-l+1);
                r++;
            }
            else{
                hash[s.charAt(l)]=0;
                l++;
            }
           
        }
        return max;
    }
}