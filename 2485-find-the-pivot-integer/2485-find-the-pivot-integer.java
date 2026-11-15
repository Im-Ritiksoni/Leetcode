class Solution {
    public int pivotInteger(int n) {

        for(int x=1;x<=n;x++){
 
            int l_sum=0;
            int r_sum=0;

        for(int i=1;i<=x;i++){
            l_sum+=i;
        }
        for(int i=x;i<=n;i++)
        {
            r_sum+=i;
        }
        if(l_sum==r_sum)
        {
            return x;
        }
        }
        return -1;
    }
}