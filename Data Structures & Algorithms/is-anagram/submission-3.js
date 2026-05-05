class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if (s.length !== t.length) {
            return false;
        }

        const refer = new Map();

        for (const c of s) {
            if (refer.has(c)) {
                refer.set(c, refer.get(c) + 1);
            } else {
                refer.set(c, 1);
            }
        }

        for (const c of t) {
            if (!refer.has(c) || refer.get(c) === 0) {
                return false;
            }
            refer.set(c, refer.get(c) - 1);
        }

        return true;
    }
}
