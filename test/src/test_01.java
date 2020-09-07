class test_01{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.GetFragment("aaabbaaacc"));
    }

}




 class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串
     * @return int整型
     */
    public int GetFragment (String str) {
        // write code here
        char[]c = str.toCharArray();
        System.out.println(c.length);
        int s1=1;
        int count = 0;
        int avg = 0;
        int s = 1;
        for(int i = 1;i<c.length;i++){
            if(c[i]==c[i-1]){
                s1++;
            }else if(c[i] != c[i-1]){
                count += s1;
                s1 = 1;
                s++;
            }else if (c[i]==0){
                continue;
            }
        }
        System.out.println(count);
        System.out.println(s);
        avg = count/s;
        return avg;
    }
}

