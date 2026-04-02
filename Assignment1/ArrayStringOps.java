import java.util.Arrays;

public class ArrayStringOps {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 2};
        System.out.println("Original: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted:   " + Arrays.toString(arr));
        int max = arr[arr.length - 1];
        int sum = 0;
        for (int x : arr) sum += x;
        double avg = (double) sum / arr.length;
        System.out.println("Max: " + max + ", Avg: " + avg);
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        System.out.println("Reversed: " + Arrays.toString(arr));
        int key = 8;
        boolean found = false;
        for (int x : arr) if (x == key) { found = true; break; }
        System.out.println("Search " + key + ": " + (found ? "Found" : "Not found"));
        String s = "Hello World";
        System.out.println("Reversed: " + new StringBuilder(s).reverse());
    }
}
