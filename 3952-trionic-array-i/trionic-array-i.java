class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int i = 0;

        // 1️⃣ First increasing sequence
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Peak can't be at start or end
        if (i == 0 || i == n - 1) return false;

        int peak = i;

        // 2️⃣ Decreasing sequence
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // Valley can't be same as peak or at end
        if (i == peak || i == n - 1) return false;

        // 3️⃣ Final increasing sequence
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Must consume entire array
        return i == n - 1;
    }
}
