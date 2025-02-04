// Approach-1
// T.C : O()
// S.C : O()
class Solution {
    int diameter=0;
    int diameter(Node root) {
        // Your code here
        calculateDiameterUsingHeight(root);
        return diameter;
    }
    
    int calculateDiameterUsingHeight(Node root) {
        if(root == null) return -1;
        
        int leftHeight = calculateDiameterUsingHeight(root.left);
        int rightHeight = calculateDiameterUsingHeight(root.right);
        
        diameter = Math.max(diameter, leftHeight + rightHeight + 2);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}