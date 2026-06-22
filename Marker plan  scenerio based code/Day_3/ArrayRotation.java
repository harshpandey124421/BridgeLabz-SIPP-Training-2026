// Subtopic: 1D Arrays - Rotation
public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;
        int n = arr.length;
        k = k % n;
        
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}