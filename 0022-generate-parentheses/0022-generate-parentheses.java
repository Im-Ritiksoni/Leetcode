class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
       solve(n,n,"",li);
       return li;
    }
      void solve(int open,int close,String op,List<String> li)
      {
        if(open==0 && close==0)
        {
            li.add(op);
            return;
        }
        if(open!=0)
        {
          solve(open-1, close, op+"(", li);
        }
        if(close>open)
        {
          solve(open, close-1, op+")", li);
        }
      }
    }
