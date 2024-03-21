import java.util.Arrays;

public class shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int[] list = new int[nums.length];
        list[0] = nums[0];
        for (int i = 0; i < n; i++) {
            list[i * 2] = nums[i];
            list[i * 2 + 1] = nums[i + n];
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 25, 21, 232, 2214, 7 };
        int n = 3;
        String array = Arrays.toString(shuffle(nums, n));
        System.out.println(array);
    }
}
