class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> check = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            check.add(nums1[i]);
        }
        
        for(int i=0; i<nums2.length; i++){
            if(check.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }
        
        int[] result = new int[intersect.size()];
        
        int i = 0;
        
        for(int x:intersect){
            result[i++] = x;
        }
        
        return result;
    }
}