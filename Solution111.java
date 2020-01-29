/*
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution111 {
    public int minDepth(TreeNode root) {
        //根节点为空，深度为0
        if(root==null) return 0;
        //根节点不为空，根节点没有子节点，深度为1
        if(root.left==null&&root.right==null) return 1;
        //初始化深度变量为最大值，方便后面比较最小值
        int min_depth = Integer.MAX_VALUE;
        //根节点和子节点不都为空，分别递归遍历左节点和右节点
        if(root.left!=null){
            min_depth = Math.min(minDepth(root.left),min_depth);
        }
        if(root.right!=null){
            min_depth = Math.min(minDepth(root.right),min_depth);
        }
        //+1得到最小深度
        return min_depth+1;

    }
}