import java.util.Arrays;

public class smaller {
    public static int[] smaller(int[] nums) {
        int[] list = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    x++;
                }
            }
            list[i] = x;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 33, 21, 142, 132, 321 };
        String array = Arrays.toString(smaller(nums));
        System.out.println(array);
    }
}