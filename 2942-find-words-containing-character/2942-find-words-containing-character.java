class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>list=new ArrayList<>();
        int index=0;
        for(String word:words)
        {
            if(word.indexOf(x)!=-1)
            {
                list.add(index);
            }
            index++;
        }
        return list;
    }
}