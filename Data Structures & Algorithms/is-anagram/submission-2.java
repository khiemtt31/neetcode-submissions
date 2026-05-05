class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> ref = new HashMap<>();

        for (var c : s.toCharArray()) {
            if (ref.containsKey(c)) {
                ref.put(c, ref.get(c) + 1);
            } else {
                ref.put(c, 1);
            }
        }

        for (var c : t.toCharArray()) {
            if (!ref.containsKey(c) || ref.get(c) == 0) {
                return false;
            }
            ref.put(c, ref.get(c) - 1);
        }

        return true;
    }
}
