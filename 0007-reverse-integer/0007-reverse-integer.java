class Solution {
    public int reverse(int x) {
        long s=0;
    
        while(x>0 || x<0)
        {
            int digit=x%10;
         s=s*10+digit;
            x=x/10;
        }

        if(s > Integer.MAX_VALUE || s < Integer.MIN_VALUE)
        {
            return 0;
        }

        return (int)s;
        
    }
}