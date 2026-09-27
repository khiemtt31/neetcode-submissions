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
            int realMax = 1;

            if (!set.contains(num - 1)) {
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    realMax++;
                }
            }

            max = Math.max(max, realMax);
        }

        return max; 
    }
}
