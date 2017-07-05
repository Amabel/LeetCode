package solution;

public class StringToInteger {

    public static void main(String[] args) {
        String str = "-2147483648";
        int res = new StringToInteger().solution_1(str);
        System.out.println(res);
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
