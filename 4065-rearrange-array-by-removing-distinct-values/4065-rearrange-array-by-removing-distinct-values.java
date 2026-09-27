class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int ans[]=new int[n]; 
       
       TreeMap<Integer,Integer> map=new TreeMap<>();

       for(int i=0;i<n;i++)
       {
       map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       }
      
      int index=0;
      int remaining=n;

      while(remaining>0)
      {
       for(int x:map.keySet())
       {
        if(map.get(x)>0)
        {
            ans[index++]=x;
            map.put(x,map.get(x)-1);
            remaining--;
        }
       }

       
      }


       return ans;
    }
}