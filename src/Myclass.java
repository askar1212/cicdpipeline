public class Myclass{
  public static int findMax(int arr[]){
    int max = arr[0];
    for (int i=1;i<arr.length;i++){
      if (max<arr[i])
       max=arr[i];
      }
     return max;
  }
  public static void main(String[] args)
   {
    System.out.println(Myclass.findMax(new int[] {1,2,3,4,5}));
   }
}
