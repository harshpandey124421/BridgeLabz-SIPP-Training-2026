public class SensorReadings {
    public static boolean isStrictlyIncreasing(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] >= arr[index + 1]) return false;
        return isStrictlyIncreasing(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] readings = {12, 15, 18, 22, 30};
        System.out.println(isStrictlyIncreasing(readings, 0));
    }
}