class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagram = new HashMap<>();
        for(String str:strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted =new String(ch);
            if(!anagram.containsKey(sorted))
            {
                List<String> st = new ArrayList<>();
                st.add(str);
                anagram.put(sorted,st);
            }
            else
            {
                List<String> existingarray = anagram.get(sorted);
                existingarray.add(str);
            }
        }
        List<List<String>> result = new ArrayList();
        for(List<String> group:anagram.values())
        {
        result.add(group);
        }
        return result;
    }
}
