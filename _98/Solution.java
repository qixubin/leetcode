package _98;

/**
 * Created by hacker on 7/28/2016.

 Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.

 Example 1:

    2
  /  \
 1    3

 Binary tree [2,1,3], return true.

 Example 2:

   1
  / \
 2   3

 Binary tree [1,2,3], return false.

 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Integer val = root.val;


        return  (root.left ==null || root.left.val < val)
                && (root.right ==null || root.right.val > val)
                && helper(root.right, val ,null)
                && helper(root.left, null, val);
    }

    public boolean helper(TreeNode root, Integer leftBound, Integer rightBound){
        if (root == null) return true;

        int val = root.val;
        return  (leftBound ==null || leftBound <val)
                &&(rightBound ==null || val < rightBound)
                && (root.left ==null || root.left.val < val)
                && (root.right ==null || root.right.val > val)
                && helper(root.right, val ,rightBound)
                && helper(root.left, leftBound, val);
    }

}
