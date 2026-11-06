class Solution {
    public int[] rearrangeArray(int[] nums) {
        int list[] = new int[nums.length];
        int positive = 0;
        int negative = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                list[positive] = nums[i];
                positive += 2;
            }else{
                list[negative] = nums[i];
                negative += 2;
            }
        }
        return list; 
    }
}