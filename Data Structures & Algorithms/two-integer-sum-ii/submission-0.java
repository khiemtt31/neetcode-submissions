class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[] {0, 1};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // calculate sum 
            int sum = nums[left] + nums[right];

            // check compares to target
            if (sum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
            }

            // move pointers
            if (sum > target) {
                right--;
            } else {
                left++;
            }

        }

        return res;
    }
}
