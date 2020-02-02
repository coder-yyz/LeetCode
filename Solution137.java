//异或运算
//异或也叫半加运算，其运算法则相当于不带进位的二进制加法：二进制下用1表示真，0表示假
// 异或的运算法则为：0⊕0=0，1⊕0=1，0⊕1=1，1⊕1=0（同为0，异为1），这些法则与加法是相同的，只是不带进位，所以异或常被认作不进位加法。
class Solution137 {
    public int singleNumber(int[] nums) {
        int i = 0;
        for (int j:nums) {
            //如果是重复数字，异或运算为0
            //不为重复数字，0^i = i
            i^=j;
        }
        return i;

    }
//public static void main(String[] args) {
//    System.out.println(2^2); //输出0
//    System.out.println(2^1); //输出3
//    System.out.println(1^2); //输出3
//    System.out.println(1^1); //输出0
//}
}