class Solution {
    public boolean check(int[] nums) {
      int n = nums.length;
      int breaks = 0;

      for(int i=1; i<n; i++){
        if(nums[i] < nums[i-1]){
            breaks++;
        }
      } 
      if(nums[n-1] > nums[0]){
            breaks++;
        }
      return breaks <= 1;
    }
}