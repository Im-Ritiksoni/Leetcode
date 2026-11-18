class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers=new ArrayList<>();
        int factorial[]=new int[n+1];
        StringBuilder result=new StringBuilder();

        factorial[0]=1;
        for(int i=1;i<=n;i++){
            factorial[i]=factorial[i-1]*i;
            numbers.add(i);
        }
        k--;
        for(int i=n;i>=1;i--){
            int index=k/factorial[i-1];
            result.append(numbers.get(index));
            numbers.remove(index);
            k=k%factorial[i-1];
        }
        return result.toString();
    }
}