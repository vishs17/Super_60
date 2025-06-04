import java.util.Arrays;

public class radixSort {

 public static void radixSort(int[] arr) {
  int max = getMax(arr);

  for (int exp = 1; max / exp > 0; exp *= 10) {
   countSort(arr, exp);
  }
 }

 private static int getMax(int[] arr) {
  int max = arr[0];
  for (int i = 1; i < arr.length; i++) {
   if (arr[i] > max) {
    max = arr[i];
   }
  }
  return max;
 }

 private static void countSort(int[] arr, int exp) {
  int n = arr.length;
  int[] output = new int[n];
  int[] count = new int[10];

  // Count occurrences of digits
  for (int i = 0; i < n; i++) {
   int digit = (arr[i] / exp) % 10;
   count[digit]++;
  }

  // Update count[i] so it holds the actual position of the digit in output[]
  for (int i = 1; i < 10; i++) {
   count[i] += count[i - 1];
  }

  // Build the output array
  for (int i = n - 1; i >= 0; i--) {
   int digit = (arr[i] / exp) % 10;
   output[count[digit] - 1] = arr[i];
   count[digit]--;
  }

  // Copy the sorted numbers back to the original array
  for (int i = 0; i < n; i++) {
   arr[i] = output[i];
  }
 }

 public static void main(String[] args) {
  int[] arr = {325, 3, 246, 192, 5};
  radixSort(arr);
  System.out.println(Arrays.toString(arr));
 }
}
