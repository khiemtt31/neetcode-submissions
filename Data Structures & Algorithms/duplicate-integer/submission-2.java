class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> numMap = new HashMap<Integer, Boolean>();

        for (var i: nums) {
            if (numMap.containsKey(i)) {

                numMap.put(i, true);

                return true;
            } else {
                numMap.put(i, false);
            }
        }

        return false;
    }
}