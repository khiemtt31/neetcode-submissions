class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for (String str : tokens) {
            if (str.equals("+")) {
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a + b);
            } else if (str.equals("-")) {
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a - b);
            } else if (str.equals("*")) {
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a * b);
            } else if (str.equals("/")) {
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a / b);
            } else {
                nums.push(Integer.parseInt(str));
            }
        }

        return nums.pop();
    }
}