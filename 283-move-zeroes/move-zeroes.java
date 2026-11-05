class Solution {
    public void moveZeroes(int[] nums) {
    //    int j=-1;
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]==0){
    //         j=i;
    //         break;
    //     }
    //    }
    //    if(j == -1){
    //     return;
    //    }
    //    for(int i=j+1;i<nums.length;i++){
    //     if(nums[i]!=0){
    //         swap(nums,i,j);
    //         j++;
    //     }
    //    }
    // }
    // public void swap(int[]nums,int i,int j){
    //     int temp=nums[i];
    //     nums[i]=nums[j];
    //     nums[j]=temp;


        int i = 0;
        for(int j=0; j<nums.length;j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}