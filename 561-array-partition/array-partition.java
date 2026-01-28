class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length; 
        int maxSum = 0; 
        for(int i = 0; i < n; i+=2) {
            maxSum += nums[i];

        }
        return maxSum; 
        
    }
}