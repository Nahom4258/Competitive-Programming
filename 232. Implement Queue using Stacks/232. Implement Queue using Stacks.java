class MyQueue {
Stack<Integer> left = new Stack<Integer>();
    Stack<Integer> right = new Stack<Integer>();

    public MyQueue() {
    }

    public void push(int x) {
        left.push(x);
    }

    public int pop() {
        int size = left.size();
        for(int i = 0; i<size; i++){
            right.push(left.pop());
        }
        int value = right.pop();
        for(int i = 0; i<size-1; i++){
            left.push(right.pop());
        }
        return value;
    }

    public int peek() {
        int size = left.size();
        for(int i = 0; i<size; i++){
            right.push(left.pop());
        }
        int value = right.peek();
        for(int i = 0; i<size; i++){
            left.push(right.pop());
        }
        return value;
    }

    public boolean empty() {
        return !(left.size() > 0) ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
