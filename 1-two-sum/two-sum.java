import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create a HashMap to store number as the key and index as the value.
        HashMap<Integer, Integer> hm = new HashMap<>();
        // Traverse the array using a loop.
        for(int i=0; i<nums.length; i++){
           // Calculate the required number:
            //req_num = target - nums[i]
            int req_num = target-nums[i];
           //Check whether req_num exists in the HashMap.
            if(hm.containsKey(req_num)){
                //If it exists, return the index of req_num and the current index.
                return new int[]{hm.get(req_num),i};
            }
            //Otherwise, store the current number and its index in the HashMap.
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
}