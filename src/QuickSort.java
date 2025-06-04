public class QuickSort {
 // Swap two elements in the array
 public static void swap(int[] arr, int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
 }

 // Partition the array and return the partition index
 public static int partitionIndex(int[] arr, int s, int e) {
  int pivot = arr[s];
  int count = 0;

  for (int i = s + 1; i <= e; i++) {
   if (arr[i] < pivot) {
    count++;
   }
  }

  int pivotIndex = s + count;
  swap(arr, s, pivotIndex);

  int i = s, j = e;
  while (i < pivotIndex && j > pivotIndex) {
   while (arr[i] < pivot) {
    i++;
   }
   while (arr[j] > pivot) {
    j--;
   }
   if (i < pivotIndex && j > pivotIndex) {
    swap(arr, i, j);
    i++;
    j--;
   }
  }

  return pivotIndex;
 }

 // QuickSort function
 public static void quickSort(int[] arr, int s, int e) {
  if (s >= e) {
   return;
  }

  int pi = partitionIndex(arr, s, e);
  quickSort(arr, s, pi - 1);
  quickSort(arr, pi + 1, e);
 }

 // Main function to test QuickSort
 public static void main(String[] args) {
  int[] arr = {8, 4, 7, 3, 2, 6, 5, 1};
  quickSort(arr, 0, arr.length - 1);
  System.out.println("Sorted Array:");
  for (int num : arr) {
   System.out.print(num + " ");
  }
 }
}