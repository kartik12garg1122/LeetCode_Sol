class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int l=0;
        int h=nums.length-1;
        Arrays.fill(arr,-1);
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                h=mid-1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        l=0;
        h=nums.length-1;
         while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return arr;
    }
}