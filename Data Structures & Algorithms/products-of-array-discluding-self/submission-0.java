class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int n = nums.length;
        leftProduct[0]=1;
        rightProduct[n-1] = 1;
        for(int i =1;i<n;i++){
            leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        for(int i =n-1;i>0;i--){
            rightProduct[i-1] = rightProduct[i]*nums[i];
        }
        int[] answer = new int[n];
        for(int i =0;i<n;i++){
            answer[i] = leftProduct[i]*rightProduct[i];
        }
        return answer;
    }
}