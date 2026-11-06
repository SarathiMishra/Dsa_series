class Solution {
    public int maxSubArray(int[] nums) {
        // int sum=0;
        // int max_sum=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        //     if(sum>max_sum){
        //         max_sum=sum;
        //     }
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // return max_sum;

        int sum = 0; //to calculate the current subarray sum.
        int maxi = Integer.MIN_VALUE; //to store the maximum sum.
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i]; //Add the current element to sum.
            maxi = Math.max(maxi, sum); //Update the maximum sum
            //If sum becomes negative, reset it to 0 because a negative sum will decrease the sum of the next subarray.
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}