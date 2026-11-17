class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>answer=new ArrayList<>();
      for(int i=left;i<=right;i++)
      {
        if(selfDividingNumbers(i)){
            answer.add(i);
        }
      }
    return answer;
    }
public boolean selfDividingNumbers(int num){
    int temp=num;
    while(temp>0){

        int digit=temp%10;

        if(digit==0 || num % digit!=0){
            return false;
        }

        temp=temp/10;
    }
    return true;
}
}