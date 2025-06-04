public class RecursiveBinarySearch {
 public int recursiveBinarySearch(int[] arr, int key, int s, int e) {
  if (s > e) {
   return -1;
  }
  int mid = s + (e - s) / 2;
  if (arr[mid] == key) {
   return mid;
  } else if (arr[mid] < key) {
   return recursiveBinarySearch(arr, key, mid + 1, e);
  } else {
   return recursiveBinarySearch(arr, key, s, mid - 1);
  }
 }


 public static void main(String[] args) {
  int[] arr = {2, 5, 8, 10, 13, 15};
  RecursiveBinarySearch search = new RecursiveBinarySearch();
  int key = 10;
  int result = search.recursiveBinarySearch(arr, key, 0,arr.length - 1);
  if (result != -1) {
   System.out.println("Element found at index: " + result);
  } else {
   System.out.println("Element not found in the array");
  }
 }
}
