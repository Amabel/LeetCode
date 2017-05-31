public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 15, 11};
        int target = 13;

        // Approach1 (Brute Force)
        int[] res1 = new Approach1().twoSum(nums, target);
        System.out.println("Approach1 (Brute Force): ");
        System.out.println("The indices are: " + res1[0] + ", " + res1[1]);

        // Approach2 (Hashmap)
        int[] res2 = new Approach2().twoSum(nums, target);
        System.out.println("Approach2 (Hashmap): ");
        System.out.println("The indices are: " + res2[0] + ", " + res2[1]);

    }
}
