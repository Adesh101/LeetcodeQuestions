class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int count = 0;
        int[] answer = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            int j = i+1;
            while(j<=temperatures.length-1 && temperatures[j]<=temperatures[i]){
                j++;
            }
            if(j<=temperatures.length-1 && temperatures[j]>temperatures[i]){
                answer[i] = j-i;
            }
        }
        return answer;
    }
}