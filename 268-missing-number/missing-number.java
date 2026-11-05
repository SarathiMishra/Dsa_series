class Solution {
    public int missingNumber(int[] nums) {
        
        // int n = nums.length;
        // for(int i=0;i<=n;i++){
        //     int flag=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             flag=1;
        //             break;
        //         }  
        //     }
        //     if(flag == 0){
        //             return i;
        //         }
        // }
        // return n;

        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int i=0; i<n; i++){
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
}