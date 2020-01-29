class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        //根节点为空，肯定不可能存在路径了
        if (root == null) return false;
        //用总和减去节点数据
        sum -= root.val;
        //根节点的左子节点和右子节点都为空，说明此时该节点为叶子节点
        if (root.left == null && root.right == null)
            //当遍历到叶子节点时，判断sum是否为0，如果是0，返回true，否则返回false
            return (sum == 0);
        //递归，当发现一条符合条件的路径时，返回true，当遍历完所有的路径，没有发现符合条件的，返回false
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);

    }
}