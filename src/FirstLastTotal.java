public class FirstLastTotal {


 static int firstoccurance(int[] arr, int key){
      int s = 0;
  int e = arr.length - 1;
  int ans = -1;
  while (s <= e) {
   int mid = s + (e - s) / 2;
   if (arr[mid] == key) {
    ans = mid;
    e = mid - 1;
   } else if (arr[mid] < key) {
    s = mid + 1;
   } else {
    e = mid - 1;
   }
  }
  return ans;
 }
      

 static int lastoccurance(int[] arr, int key){
  int s = 0;
  int e = arr.length - 1;
  int ans = -1;
  while (s <= e) {
   int mid = s + (e - s) / 2;
   if (arr[mid] == key) {
    ans = mid;
    s = mid + 1;
   } else if (arr[mid] < key) {
    s = mid + 1;
   } else {
    e = mid - 1;
   }
  }
  return ans;
 }


 static int totaloccurance(int[] arr, int key){
  int fo = firstoccurance(arr, key);
  int lo = lastoccurance(arr, key);
  if (fo == -1 || lo == -1) {
   return 0;
  }
  return lo - fo + 1;
 }



 public static void main(String[] args) {
  int[] arr = {1,2,3,3,3,3,4,5};
  int f = firstoccurance(arr, 3);
  int l = lastoccurance(arr, 3);
  int t = totaloccurance(arr, 3);
  System.out.println("First: " + f + " Last: " + l + " Total: " + t);
 }
}
