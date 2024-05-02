package Binary_tree;

import javax.swing.tree.TreeNode;
import java.util.*;

public class pseudo_palindrome_paths {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int pseudoPalindromicPaths (TreeNode root) {
        int[] count = new int[10];
        return dfs(root, count);

    }

    private static int dfs(TreeNode root, int[] count) {
        if (root == null) {
            return 0;
        }
        count[root.val]++;
        if (root.left == null && root.right == null) {
            int odd = 0;
            for (int i : count) {
                if (i % 2 == 1) {
                    odd++;
                }
            }
            count[root.val]--;
            return odd <= 1 ? 1 : 0;
        }
        int left = dfs(root.left, count);
        int right = dfs(root.right, count);
        count[root.val]--;
        return left + right;
    }
    private TreeNode root;
    public static void main(String[] args) {
        pseudo_palindrome_paths tree = new pseudo_palindrome_paths();
        tree.root = tree.new TreeNode(2);
        tree.root.left = tree.new TreeNode(3);
        tree.root.right = tree.new TreeNode(1);
        tree.root.left.left = tree.new TreeNode(3);
        tree.root.left.right = tree.new TreeNode(1);
        tree.root.right.right = tree.new TreeNode(1);
        System.out.println(tree.pseudoPalindromicPaths(tree.root));
    }
}
