// Appraoch-1 (Brute Force)
// T.C : O(n * n)
// S.C : O(n * n)
class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        int n = arr.length;
        Node head = new Node(arr[0][0]);
        construct(head, arr, 0, 0, n);
        return head;
    }
    
    static void construct(Node head, int[][] arr, int i, int j, int n){
        if(i  >= n || j >= n){
            return;
        }
        if(i + 1 == n){
            head.down = null;
        }else{
            head.down = new Node(arr[i + 1][j]);
            construct(head.down, arr, i + 1, j, n);
        }
        if(j + 1 == n){
            head.right = null;
        }else{
            head.right = new Node(arr[i][j + 1]);
            construct(head.right, arr, i, j + 1, n);
        }
    }
}

// Appraoch-1 (Brute Force With Optimised Code)
// T.C : O(n * n)
// S.C : O(n * n)
class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        int n = arr.length;
        if(n == 0){
            return null;
        }
        Node head = new Node(arr[0][0]);
        construct(head, arr, 0, 0, n);
        return head;
    }
    
    static void construct(Node head, int[][] arr, int i, int j, int n){
        if(i  >= n || j >= n){
            return;
        }
        if(i + 1 < n){
            head.down = new Node(arr[i + 1][j]);
            construct(head.down, arr, i + 1, j, n);
        }
        if(j + 1 < n){
            head.right = new Node(arr[i][j + 1]);
            construct(head.right, arr, i, j + 1, n);
        }
    }
}