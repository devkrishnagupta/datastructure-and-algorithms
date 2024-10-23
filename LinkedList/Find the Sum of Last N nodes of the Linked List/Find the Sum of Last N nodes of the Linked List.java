// Approach-1
// T.C : O()
// S.C : O()
class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        if(head == null || n <= 0) return 0;
        
        Node temp = head;
        int count = 0;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        // if n is greater than the number of nodes, then adjust n.
        if(n > count) n = count;
        
        // Reset temp to head for the second pass
        temp = head;
        int sum = 0;

        for(int i = 0; i < count - n; i++){
            temp = temp.next;
        }
        
        while(temp != null){
            sum += temp.data; 
            temp = temp.next;
        }
        
        return sum;
    }
}