package com.datastructure.linkedlist;

class TreeNode {
    int val;
    TreeNode left, right;

    // Constructor
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}


public class BinaryTreePreorderTraversal {

    // Preorder traversal: root -> left -> right
    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Print the current node's value
        System.out.print(root.val + " ");

        // Recursively traverse the left subtree
        preorder(root.left);

        // Recursively traverse the right subtree
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Constructing the binary tree for testing
        TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Calling the preorder traversal function

        preorder(root);
    }
}
