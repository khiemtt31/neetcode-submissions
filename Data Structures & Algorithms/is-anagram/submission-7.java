class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> checkerViet = new HashMap<Character, Integer>();

        for (var c : s.toCharArray()) {
            if (checkerViet.containsKey(c)) {
                checkerViet.put(c, checkerViet.get(c) + 1);
            } else {
                checkerViet.put(c, 1);
            }
        }

        for (var c : t.toCharArray()) {
            if (!checkerViet.containsKey(c) || checkerViet.get(c) == 0) {
                return false;
            } else if (checkerViet.containsKey(c)) {
                checkerViet.put(c, checkerViet.get(c) - 1);
            }
        }

        return true;
    }
}
