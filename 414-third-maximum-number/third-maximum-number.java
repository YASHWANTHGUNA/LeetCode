class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length; 
         int distinctCount = 1;  
        int prev = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != prev) {
                distinctCount++;
                prev = nums[i];
            }

            if (distinctCount == 3) {
                return nums[i];
            }
        }

      
        return nums[n - 1];
        
    }
}