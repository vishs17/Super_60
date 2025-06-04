//public class JaggedArrays {
// public static void main(String[] args) {
//  int[][] jagged = {{1,2,3,4},
//                    {4,5,6,7},
//                    {7,8,9,0}};
//  for (int i=0;i<3;i++){
//   for(int j=0; j<4;j++){
//    System.out.print(jagged[i][j]+"");
//
//   }
//   System.out.println();
//  }
// }
//}
//2D array with unequal row length called as jagged array

public class JaggedArrays {
 public static void main(String[] args) {
  int[][] jagged = {{1,2,3,4},
          {4,5,6,7},
          {7,8,9}};
  for (int i=0;i< jagged.length;i++){
   for(int j=0; j< jagged[i].length;j++){
    System.out.print(jagged[i][j]+" ");

   }
   System.out.println();
  }
  System.out.println();
// using for each function
 for(int[] arr : jagged){
  for(int x : arr){
   System.out.print(x + " ");
  }
  System.out.println();
 }
  System.out.println();
 char[][] languages = {{'J','A','V','A'},
                       {'C','+','+'},
                       {'P','Y','T','H','O','N'}};

 for(char[] ch : languages){
  for(char x : ch){
   System.out.print(x + " ");

  }
  System.out.println();
 }
 }

}


