package com.yin.tree;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的中序遍历 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
//        if(root != null) {
//            inorderTraversal(root.left);
//            list.add(root.val);
//            inorderTraversal(root.right);
//        }
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if(root != null) {
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }

    }
}
