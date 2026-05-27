class Solution {
    public void sortColors(int[] nums) {
                int[] freq = new int[3];

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int index = 0;

        // Fill 0s
        while (freq[0] > 0) {
            nums[index++] = 0;
            freq[0]--;
        }

        // Fill 1s
        while (freq[1] > 0) {
            nums[index++] = 1;
            freq[1]--;
        }

        // Fill 2s
        while (freq[2] > 0) {
            nums[index++] = 2;
            freq[2]--;
        }
    }
}