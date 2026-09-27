class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] meow = s.toCharArray();

        while(left < right) {
            while (left < right && !Character.isLetterOrDigit(meow[left])) {
                left++;
            }

            while (right > left && !Character.isLetterOrDigit(meow[right])) {
                right--;
            }

            if (Character.toLowerCase(meow[right]) != Character.toLowerCase(meow[left])) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
