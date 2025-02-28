// Approach-1
// T.C : O()
// S.C : O()
class Solution {

    private Stack<Integer> i;
    private Stack<Integer> j;

    public Solution() {
        // code here
        i = new Stack<>();
        j = new Stack<>();
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        i.push(x);
        if (j.isEmpty() || x <= j.peek()) {
            j.push(x);
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if (!i.isEmpty()) {
            if (i.pop().equals(j.peek())) {
                j.pop();
            }
        }
    }

    // Returns top element of Stack
    public int peek() {
        // code here
        return i.isEmpty() ? -1 : i.peek();
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        return j.isEmpty() ? -1 : j.peek();
    }
}