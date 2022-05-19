class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, max = 0;
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        for(int right=0; right<s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right) - 'A']);
            
            int letterstochange = (right - left + 1) - mostFreqLetter;
            if(letterstochange > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}