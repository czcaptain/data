package com.yin.tree;

public class 二叉树的深度 {
    public int maxDepth(TreeNode root) {
        if(root != null) {
            return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
        } else {
            return 0;
        }
    }
}
