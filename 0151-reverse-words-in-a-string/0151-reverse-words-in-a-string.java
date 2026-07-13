class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[]arr=s.split("\\s+");
        int l=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(l>i){
                String temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l--;
            }
            
        }
        String str=String.join(" ",arr);
        return str;
    }
}