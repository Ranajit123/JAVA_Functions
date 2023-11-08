import java.util.*;

public class findLCM {

  public static int LCM(int num1, int num2){
    int greater = Math.max(num1, num2);
    int smallest = Math.min(num1, num2);
    for(int i =greater;;i+=greater){ // here condition is not given, that means codition is always true
      if(i%smallest == 0){
        return i;
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    sc.close();
    System.out.println("The LCM of "+num1+ "  and " +num2+" is "+LCM(num1, num2));
  }
}