// Approach-1
class MyQueue {
    
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<Integer>();
        output = new Stack<Integer>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(!output.isEmpty()){
            return output.pop();
        }
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.pop();
    }
    
    public int peek() {
        if(!output.isEmpty()){
            return output.peek();
        }
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.peek();
    }
    
    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
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



 // Approach-2
 //T.C : push - O(1), pop - Amortized O(1) , peek() - O(1), empty() - O(1)
//S.C : O(n)
class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;
    private int peekEl;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
        peekEl = -1;
    }

    public void push(int x) {
        if (input.empty()) {
            peekEl = x;
        }
        input.push(x);
    }

    // Amortized O(1) *****************************************************************************************
    public int pop() {
        if (output.empty()) {
            // Transfer elements from input to output (O(n))
            while (!input.empty()) {
                output.push(input.pop());
            }
        }

        int val = output.pop();
        return val;
    }

    public int peek() {
        if (output.empty()) {
            return peekEl;
        }

        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}