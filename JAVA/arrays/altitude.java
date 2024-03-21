public class altitude {

    public static void main(String[] args) {
        int[] gain = { 21, 22, 232, 23, -23, -544, -23, 65, 67, 92, -28, 97, 100, 81 };
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            arr[i + 1] = arr[i] + gain[i];
            max = Math.max(max, arr[i + 1]);
        }
        return max;
    }
}