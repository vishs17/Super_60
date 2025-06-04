import java.util.Arrays;

//becomes and divides all into single elements (recurssion)
//later merges all
public class MergeSortDnC {
public static void mergeSort(int[] arr){
 if(arr.length < 2){
  return ;
 }
 int mid = arr.length/2 ;
 int[] left = Arrays.copyOfRange(arr , 0 , mid);
 int[] right =Arrays.copyOfRange(arr,mid,arr.length);
 mergeSort(left);
 mergeSort(right);
 merge(arr,left,right);
}

 public static void merge(int[] arr ,int[] left , int[] right) {
  int i=0, j=0, k=0;
while (i< left.length && j< right.length){
 if(left[i] < right[j]){
  arr[k++] = left[i++];
 }
 else {
  arr[k++] = right[j++];
 }
}
while (i<left.length){
 arr[k++] = left[i++];
}
while (j<right.length){
 arr[k++] = right[j++];
}
}

 public static void main(String[] args) {
  int[] arr = {0 , -1 ,-5 , 5,3 };
  mergeSort(arr);
  System.out.println(Arrays.toString(arr));
 }
}
