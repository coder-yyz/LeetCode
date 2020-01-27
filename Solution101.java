public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        //如果为空，则是堆成二叉树
        if(root==null) return true;
        //不为空，返回左子树和右子树。交给isMirror函数判断两个子树是否对称
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode t1,TreeNode t2){
        //两个子树都为空，对称
        if(t1==null&&t2==null) return true;
        //一个子树为空，不对称
        if(t1==null||t2==null) return false;
        //两个子树都不为空，判断节点数据是否相等，再递归判断子节点是否对称
        return (t1.val==t2.val) &&isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);

    }
}

