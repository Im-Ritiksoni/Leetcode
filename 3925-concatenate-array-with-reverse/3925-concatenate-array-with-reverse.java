class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int m=n*2;
        int ans[]=new int[m];
        for(int i=0;i<=n-1;i++){
            ans[i]=nums[i];
            //ans[i+n]=nums[n-i-1];
            ans[m-i-1]=nums[i];
        }
        return ans;
    }
        
    }
