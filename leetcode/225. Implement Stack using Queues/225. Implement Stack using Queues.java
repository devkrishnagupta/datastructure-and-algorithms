//Approach-2 (Using 2-Queue)
class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

//Approach-2 (Using 1-Queue)
class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int size=q.size();
        while(size>1){
            int el=q.remove();
            q.add(el);
            size--;
        }
        return q.remove();
        
    }
    
    public int top() {
        int size=q.size();
        while(size>1){
            int el=q.remove();
            q.add(el);
            size--;
        }
        int res=q.peek();
        int el=q.remove();
        q.add(el);
        return res;
        
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
//Approach-2 (Using 1-Queue)
class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        int size=q.size();
        q.add(x);
        while(size>0){
            int el=q.remove();
            q.add(el);
            size--;
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */