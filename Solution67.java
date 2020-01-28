class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ca = 0;
        //两个字符串同步进行循环，模拟进位
        for(int i = a.length()-1,j = b.length()-1;i>=0||j>=0;i--,j--){
            int sum = ca;
            //将短的字符串的高位用0补齐
            //-‘0’，字符之间的加减，实际上利用 ASCII 码，
            //字符在内部都用数字表示，‘0’-‘0’ = 0，‘1’-‘0’=1，
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            //判断相加是否为2，模拟进位
            sb.append(sum % 2);
            ca = sum / 2;
        }
        //相加结束，判断最高位是否有进位
        sb.append(ca == 1 ? ca : "");
        //反转字符串，因为是从低位到高位，所以要反转过来
        return sb.reverse().toString();
    }
}