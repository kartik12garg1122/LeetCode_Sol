class Solution {
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        StringBuilder temp=new StringBuilder();
        func(0,digits,ans,temp);
        return ans;
    }
    public void  func(int index,String digits,List<String>ans,StringBuilder temp){
        if(index==digits.length()){
            ans.add(temp.toString());
            return;
        }
        int digit=digits.charAt(index)-'0';
        String l=map[digit];
        for(int i=0;i<l.length();i++){
            temp.append(l.charAt(i));
            func(index+1,digits,ans,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}