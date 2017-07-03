package solution;

public class StringToInteger {
    // 考虑长度大于 32-bit 的情况
    // 考虑非数字的情况（报错）
    // 空指针
    public static void main(String[] args) {
        String str = "123";
        int res = new StringToInteger.solution(str);
        System.out.println(res);
    }

    public int solution(String str) {
        if (null == str) {
            throw new IllegalArgumentException("str is null!");
        }

        int ret = 0;
        int len = str.length();

        for (int i=0; i<len< i++) {
            char c = str.charAt(i);
            int digit = c - "0";
            if (0<= digit && digit <= 9) {
                ret = ret * 10 + digit;
            } else {
                throw new IllegalArgumentException("str must only contain numbers!");
            }
        }
        return ret;
    }

}
