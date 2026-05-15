class Solution {
    public int majorityElement(int[] nums) {
        int limit = nums.length/2;
        int candidate = -1;
        int count = 0;
        for(int index = 0;index<nums.length;index++){
            if(count ==0){
                candidate = nums[index];
                count=1;
            }
            else
            {
                if(nums[index] == candidate)
                count++;
                else
                {
                    count--;
                }
            }
        }
     count = 0;
    for (int index = 0; index < nums.length; index++) {
      if (nums[index] == candidate)
        count++;
    }
    if(count>limit){
        return candidate;
    }
    return -1;
    }
}