class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int idx=0; idx<s.length(); idx++){
            if(!map.containsKey(s.charAt(idx))){
                map.put(s.charAt(idx), 1);
            }
            else{
                int count = map.containsKey(s.charAt(idx)) ? map.get(s.charAt(idx)) : 0;
                map.put(s.charAt(idx), count + 1);
            }
        }
        
        for(int idx=0; idx<t.length(); idx++){
            if(!map.containsKey(t.charAt(idx))){
                return false;
            }
            else if(map.containsKey(t.charAt(idx)) && map.get(t.charAt(idx))==0){
                return false;
            }
            else{
                int count = map.get(t.charAt(idx));
                map.put(t.charAt(idx), count - 1);
            }
        }
        
    return true;
    }
}