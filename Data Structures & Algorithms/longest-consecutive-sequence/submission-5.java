class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = 1;
        int realMax = 1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                max++;
            } else if (nums[i + 1] == nums[i]) {
                continue;
            } else {
                if (max > realMax) {
                    realMax = max;
                }
                max = 1;
            }

        }

        if (max > realMax) {
            realMax = max;
        }

        return realMax;
    }
}
