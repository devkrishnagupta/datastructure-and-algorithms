// Approach-1
// T.C : O(n * logN)
// S.C : O(n)
class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        List<Integer> nodes = new ArrayList<>();
        for(Node node: arr){
            while(node != null){
                nodes.add(node.data);
                node = node.next;
            }
        }
        
        Collections.sort(nodes);
        Node ans = new Node(nodes.get(0));
        Node temp = ans;
        for(int i = 1; i < nodes.size(); i++){
            temp.next = new Node(nodes.get(i));
            temp = temp.next;
        }
        
        return ans;
    }
}