package exercise.exercise_0606;


//二叉树的镜像

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
/*
public class Solution {
    public void Mirror(TreeNode root) {
        TreeNode cur = root;
        swap(cur);
    }
    public void swap(TreeNode cur){//交换此节点的左右孩子的值
        if(cur!= null){
            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
            swap(cur.left);
            swap(cur.right);
        }else{
            return;
        }
    }
}*/
