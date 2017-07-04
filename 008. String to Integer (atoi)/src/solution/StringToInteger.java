package solution;

public class StringToInteger {
    // 考虑长度大于 32-bit 的情况
    // 考虑非数字的情况（报错）
    // 空指针
    public static void main(String[] args) {
        String str = "3147483644";
        int res = new StringToInteger().solution(str);
        System.out.println(res);
    }

    public int solution(String str) {
        if (null == str) {
            throw new IllegalArgumentException("str is null!");
        }
        if (str.length() > 10) {
            throw new IllegalArgumentException("The number is too big!");
        }
        if (0 == str.length()) {
            throw new IllegalArgumentException("str must only contain numbers!");
        }

        int ret = 0;
        int len = str.length();

        for (int i=0; i<len; i++) {
            char c = str.charAt(i);
            int digit = c - '0';
            if (0<= digit && digit <= 9) {
                if (9 == i) {
                    if (ret > 214748364 || (ret <= 214748364 && digit >= 8)) {
                        throw new IllegalArgumentException("The number is too big!");
                    }
                }
                ret = ret * 10 + digit;
            } else {
                throw new IllegalArgumentException("str must only contain numbers!");
            }
        }
        return ret;
    }

}
