// Approach-1 (Using extra space)
// T.C : O(n)
// S.C : O(n)
class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Set<Node> nodes = new HashSet<>();
        Node temp = head;
        while(temp != null){
            if(nodes.contains(temp)){
                return temp;
            }else{
                nodes.add(temp);
            }
            temp = temp.next;
        }
        return null;
    }
}

// Approach-2
// T.C : O()
// S.C : O()

