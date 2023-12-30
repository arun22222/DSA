public class array1 {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] permutation = { 0, 2, 1, 4, 3 };
        int[] resultArray = buildArray(permutation);
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
