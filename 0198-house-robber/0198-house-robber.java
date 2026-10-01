class Solution {
    public int rob(int[] nums) {

        if(nums==null || nums.length==0 ) return 0;

        if(nums.length==1)return nums[0];
        int prev2=0;
        int prev1=0;
        for(int currHouseVal:nums)
        {
            int currLoot=Math.max(prev1,currHouseVal+prev2);
            prev2=prev1;
            prev1=currLoot;
        }
        return prev1;
    }
}