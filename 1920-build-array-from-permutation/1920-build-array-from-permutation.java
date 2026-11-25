class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int sum[]=new int[n];
        for(int i=0;i<n;i++){
            sum[i]=nums[nums[i]];
        }
        return sum;
    }
}