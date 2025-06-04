import java.lang.reflect.Array;
import java.util.Arrays;

public class countSort {
 public static void countSort(int []arr){
  //find the max
  int k = arr[0];
  for(int i=0; i<arr.length; i++){
   if(arr[i]>k){
    k = arr[i];
   }
  }
   // create a count of 0 to max
  int[] count = new int [k+1];

  //calculate the frequency of each element in the array
  for (int i=0; i<arr.length ; i++){
   count[arr[i]]++;
  }

  //cumulative count
  // c = c+p
  // skip index 0 and start from index 1 to max
  for (int i=1;i<=k;i++){
   count[i] += count[i-1];
  }

  //create the output array
  int[] output = new int[arr.length];

  //start from the end
  for(int i=arr.length -1;i>=0;i--){
   output[--count[arr[i]]]= arr[i];

  }

  //output back to input
//  for(int i=0; i< arr.length; i++)
//  {
//   arr[i]= output[i];
//  }

 System.arraycopy(output,0,arr,0,arr.length);

 }

 public static void main(String[] args) {
  int[]arr = {6,4,3,4,1,2,1};
  System.out.println("Before sorting");
  System.out.println(Arrays.toString(arr));
  countSort(arr);
  System.out.println("After sorting");
  System.out.println(Arrays.toString(arr));

 }
}
