class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = 0, hi = 0;
        
        // Step 1: Establish search bounds
        for (int num : nums) {
            lo = Math.max(lo, num);   // lower bound = max single element
            hi += num;                // upper bound = sum of all elements
        }
        
        // Step 2: Binary search on the answer
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (canSplit(nums, k, mid)) {
                // mid works as a cap -> try to find a smaller one
                hi = mid;
            } else {
                // mid too small -> need a larger cap
                lo = mid + 1;
            }
        }
        
        return lo;
    }
    
    // Step 3: Greedy feasibility check
    // Can we split nums into <= k subarrays such that each subarray sum <= maxSum?
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrayCount = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                // current subarray is full, start a new one
                subarrayCount++;
                currentSum = num;
                
                if (subarrayCount > k) {
                    return false; // needed too many subarrays
                }
            } else {
                currentSum += num;
            }
        }
        
        return true;
    }
}