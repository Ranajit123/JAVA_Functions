public class rough {

  public static int LCM(int num1, int num2){
    int greater = Math.max(num1, num2);
    int smallest = Math.min(num1, num2);
    for(int i =greater;true;i+=greater){
      System.out.print(i+" ");
      if(i%smallest == 0){
        return i;
      }
    }
  }

  static boolean check(int[]arr) {

    int n = arr.length;

    for(int i=0; i < n-1;i++) {

        if(arr[i+1] <= arr[i]) {

            return false;

        }

    }

    return true;

  }
  public static void main(String[] args) {
    // int num1 = 43;
    // int num2 = 117;
    // System.out.println("The LCM of "+num1+ "  and " +num2+" is "+LCM(num1, num2));
    int arr[] = {1, 2, 3, 4};
    System.out.println(check(arr));
  }
}