public class array3 {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4 };
        int[] runningSumArray = runningSum(originalArray);
        for (int num : runningSumArray) {
            System.out.print(num + " ");
        }
    }
}
