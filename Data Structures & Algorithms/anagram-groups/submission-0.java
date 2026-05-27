public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> exiMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] strC = strs[i].toCharArray();

            Arrays.sort(strC);

            String sortedStr = new String(strC);

            if (exiMap.containsKey(sortedStr)) {
                List<String> theCurrent = exiMap.get(sortedStr);
                theCurrent.add(strs[i]);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                exiMap.put(sortedStr, newList);
            }
        }

        res.addAll(exiMap.values());

        return res;
    }
}