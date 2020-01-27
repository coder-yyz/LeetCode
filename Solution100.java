class Solution100 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //如果两个节点都为空，则相同
        if(p==null&&q==null) return true;
        //如果只有一个节点为空，则不相同
        if(p==null||q==null) return false;
        //两个节点都不为空时，比较数据是否相同
        if(p.val!=q.val) return false;
        //递归判断本节点的左子节点和右子节点是否相同
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}