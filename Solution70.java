//爬楼梯问题，题目看似复杂，实际上就是一个数学问题，类似于斐波那契数列，前两项和等于第三项
//使用循环实现
class Solution70 {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for(int i=3;i<=n;i++){
            int temp = i1+i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
    public static final void main(String[] args) {
        Solution70 s = new Solution70();
        System.out.println(s.climbStairs(10));

    }
}

