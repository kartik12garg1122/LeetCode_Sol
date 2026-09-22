class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int r=0;
        int l=0;
        int[]hash=new int[2];
        while(r<nums.length){          
                hash[nums[r]]++;
                
            if(hash[0]>k){
                hash[nums[l]]--;
                l++;
            }
            max=Math.max(max,r-l+1);
                r++;
        }
        return max;
    }
}