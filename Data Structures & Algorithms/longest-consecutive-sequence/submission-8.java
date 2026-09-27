class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int max = 1;

        HashSet<Integer> set = new HashSet();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            int current = num;
            int realMax = 1;

            if (!set.contains(current - 1)) {
                while (set.contains(current + 1)) {
                    current++;
                    realMax++;
                }
            }

            max = Math.max(realMax, max);
        }

        return max;
    }
}
