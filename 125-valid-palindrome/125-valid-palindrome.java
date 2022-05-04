class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String res = s.toLowerCase();
        int start = 0;
        int end = res.length()-1;
        
        while(start<end){
            if(res.charAt(start)!=res.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}