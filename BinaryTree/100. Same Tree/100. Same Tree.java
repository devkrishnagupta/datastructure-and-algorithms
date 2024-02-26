/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Approach-1 (Recursion)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        if(p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

// Approach-2 (BFS)
// T.C : O(n)
// S.C : O(n)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        if(p.val != q.val) return false;
        
        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();
        
        pQueue.add(p);
        qQueue.add(q);
        
        while(!pQueue.isEmpty() && !qQueue.isEmpty()){
            int pSize = pQueue.size();
            int qSize = qQueue.size();
            
            if(pSize != qSize) return false;
            
            for(int i = 0; i < pSize; i++){
                TreeNode pCurr = pQueue.poll();
                TreeNode qCurr = qQueue.poll();
                
                if(pCurr.val != qCurr.val) return false;
                if(pCurr.left != null && qCurr.left == null) return false;
                if(pCurr.left == null && qCurr.left != null) return false;
                if(pCurr.right != null && qCurr.right == null) return false;
                if(pCurr.right == null && qCurr.right != null) return false;
                
                if(pCurr.left != null)
                    pQueue.add(pCurr.left);
                if(pCurr.right != null)
                    pQueue.add(pCurr.right);
                if(qCurr.left != null)
                    qQueue.add(qCurr.left);
                if(qCurr.right != null)
                    qQueue.add(qCurr.right);
            }
        }
        
        return pQueue.size() == qQueue.size();
    }
}