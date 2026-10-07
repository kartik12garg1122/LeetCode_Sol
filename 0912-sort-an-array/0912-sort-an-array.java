class Solution {
    public int[] sortArray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        split(nums,low,high);
        return nums;
    }
    void split(int[]nums,int low,int high){
        if(low==high)return;
        int mid=(low+high)/2;
        split(nums,low,mid);
        split(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    void merge(int[]nums,int low,int mid,int high){
        ArrayList<Integer>arr=new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                arr.add(nums[i]);
                i++;
            }
            else{
                arr.add(nums[j]);
                j++;
            }
        }
        while(i<=mid){
            arr.add(nums[i]);
            i++;
        }
        while(j<=high){
            arr.add(nums[j]);
            j++;
        }
        for(int k=low;k<=high;k++){
            nums[k]=arr.get(k-low);
        }
    }
}