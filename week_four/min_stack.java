class MinStack {
    List<Integer> myStack = null;

    public MinStack() {
        myStack = new ArrayList<>();
    }
    
    public void push(int val) {
        myStack.add(val);
    }
    
    public void pop() {
        myStack.remove(myStack.size() - 1);
    }
    
    public int top() {
        int top = myStack.get(myStack.size() - 1);
        return top;
    }
    
    public int getMin() {
        int min = 2147483647;
        for(int num: myStack){
            if (num < min)
                min = num;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
