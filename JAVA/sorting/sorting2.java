import java.util.Arrays;

public class sorting2 {

    public static int findMissingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 2 };
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
