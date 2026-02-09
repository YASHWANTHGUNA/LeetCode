class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length; 
        long totalSum = 0; 
        for(int x : nums) {
            totalSum += x; 
        }
        long prefixSum = 0; 
        int count = 0; 
        for(int i = 0; i < n-1; i++) {
            prefixSum += nums[i]; 
            long rightSum = totalSum- prefixSum; 
            int rightCount = n-i-1;
            if((long)nums[i] * rightCount > rightSum) {
                count++; 
            }
        }
        return count; 
        
    }
}