class Solution {
    public int[] sortArrayByParity(int[] A) {
 int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if(A[i] % 2 == 0) {
                // Even first
                i++;
            }
            else {
                if(A[j] % 2 != 0) {
                    // Both odd
                    j--;
                }
                if (A[j] % 2 == 0) {
                    // Odd, Even
                    swap(A, i, j);
                    i++;
                    j--;
                }
            }
        }


        return A;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}