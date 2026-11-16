class Solution {
    public boolean isPalindrome(int x) {
      int a,s=0;
      int n1=x;

      if(x<0){
        return false;
      }
      while(x!=0)
      {
       a=x%10;
       s=s*10+a;
       x=x/10;
      }  
     
      return n1==s;
    }
}