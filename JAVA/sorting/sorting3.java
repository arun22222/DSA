import java.util.Arrays;

public class sorting3 {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2];
        int product2 = nums[0] * nums[1];
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] array = { 3, 5, 2, 7, 8, 1 };
        int result = maxProduct(array);
        System.out.println("Maximum Product: " + result);
    }
}
