class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l =0;
        int r = numbers.length-1;
        int ind1=0,ind2 =0;
        while(l<r){
            if(numbers[l]+numbers[r] == target){
                ind1 = l+1;
                ind2 = r+1;
                break;
            }
            else if(numbers[l]+numbers[r] > target){
                r--;
            }
            else
            {
                l++;
            }
        }
    return new int[]{ind1,ind2};
    }
}
