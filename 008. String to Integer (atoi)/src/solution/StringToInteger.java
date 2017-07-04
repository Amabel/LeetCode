package solution;

public class StringToInteger {
    // 考虑长度大于 32-bit 的情况
    // 考虑非数字的情况（报错）
    // 空指针
    public static void main(String[] args) {
        String str = "-2147483648";
        int res = new StringToInteger().solution(str);
        System.out.println(res);
    }

    public int solution_(String str) {
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

    public int solution_1(String str) {
        // empty or null string
        if (0 == str.length() || null == str) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        int ret = 0;

        // leading spaces
        while (' ' == str.charAt(index) && index < str.length()) {
            index ++;
        }

        // sign
        if ('+' == str.charAt(index) || '-' == str.charAt(index)) {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        // convert digit
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            // overflow
            // -2147483648 is judged as overflow but still return the correct int value
            if ( Integer.MAX_VALUE / 10 < ret || (Integer.MAX_VALUE / 10 == ret && Integer.MAX_VALUE % 10 < digit)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ret = 10 * ret + digit;
            index ++;
        }
        return ret * sign;
    }

}
