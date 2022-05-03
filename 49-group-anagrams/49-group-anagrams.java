class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> GroupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String current: strs){
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String hash = new String(characters);
            if(!map.containsKey(hash)){
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(current);
        }
        GroupedAnagrams.addAll(map.values());
        return GroupedAnagrams;
    }
}