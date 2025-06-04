public class sqroot {
 public static int sqroot(int n) {
  int s = 0, e = n, ans = 0;

  while (s <= e) {int mid = s + (e - s) / 2;
   int square = mid * mid;

   if (square == n) {
    return mid;
   } else if (square < n) {
    ans = mid;
    s = mid + 1;
   } else {
    e = mid - 1;
   }
  }
  return ans;
 }

 public static void main(String[] args) {
  int n = 25; // Example number
  System.out.println(sqroot(n));
 }
}
