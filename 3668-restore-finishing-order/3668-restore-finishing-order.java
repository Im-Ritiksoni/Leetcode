class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       
        Set<Integer> frnd=new HashSet<>();
        for(int Id:friends){
               frnd.add(Id);
        }
        List<Integer> answer=new ArrayList<>();
        for(int o:order){
            if(frnd.contains(o)){
                answer.add(o);
            }
        }
        return answer.stream()
        .mapToInt(a->a)
        .toArray();
    }
}