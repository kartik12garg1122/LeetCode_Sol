class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                count--;
            }
            if(max<count){
            max=count;
            }
        }
        
        return max;
    }
}