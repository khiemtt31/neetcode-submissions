class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> craks;

    public MinStack() {
        this.stack = new Stack<>();
        this.craks = new Stack<>();
    }

    public void push(int val) {
        this.stack.push(val);

        if (this.craks.isEmpty() || this.craks.peek() >= val) {
            this.craks.push(val);
        }
    }

    public void pop() {
        if (!this.craks.isEmpty() && this.stack.peek().equals(this.craks.peek())) {
            this.craks.pop();
        }

        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.craks.peek();
    }
}