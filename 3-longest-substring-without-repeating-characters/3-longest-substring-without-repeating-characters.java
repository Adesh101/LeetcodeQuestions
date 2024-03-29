class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0, j=0, end = s.length(), max = 0;
        while(j<end){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
    return max;
    }
}