class Solution {
    public int singleNumber(int[] nums) {
       // Create a variable xor = 0.
       int xor = 0;
       //Traverse the entire array using a loop
       for(int i=0; i<nums.length; i++){
        //Perform XOR between xor and every array element
        xor = xor^nums[i];
       }
       //Return xor
       return xor;
    }   
}