class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> steck = new Stack();

        for (String str : tokens) {
            if (str.equals("+")) {
                int b = steck.pop();
                int a = steck.pop();
                steck.push(a + b);
            } else if (str.equals("-")) {
                int b = steck.pop();
                int a = steck.pop();
                steck.push(a - b);
            } else if (str.equals("*")) {
                int b = steck.pop();
                int a = steck.pop();
                steck.push(a * b);
            } else if (str.equals("/")) {
                int b = steck.pop();
                int a = steck.pop();
                steck.push(a / b);
            } else {
                steck.push(Integer.parseInt(str));
            }
        }

        return steck.pop();
    }
}
