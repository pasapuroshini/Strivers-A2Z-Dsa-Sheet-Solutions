# Zig Zag Traversal

```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Solution {
    public List<List<Integer>> zigZagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = true; // true -> left to right, false -> right to left

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                if (flag) {
                    row.add(node.data);
                } else {
                    row.add(0, node.data);
                }

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            flag = !flag;
            result.add(row);
        }

        return result;
    }
}

// Helper function to print the result
class Main {
    static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.zigZagLevelOrder(root);
        printResult(result);
    }
}

```
**Time complexity : O(N), Space Complexity: O(N)**
