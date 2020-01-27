//二叉树的最大深度，实际上就是查找根节点到子节点的最大节点数，使用递归，遍历每一条路径，得到最大深度
class Solution104 {
    public int maxDepth(TreeNode root) {
        //树为空，0层
        if(root==null) return 0;
        //分别从左子树和右子树递归
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        int num;
        //判断最大的层数，并将其加一，得到最大深度
        if(leftHeight>rightHeight) num = leftHeight;
        else num = rightHeight;
        return num+1;

    }
}