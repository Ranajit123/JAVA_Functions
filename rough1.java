public class rough1 {
  public static void main(String[] args) {
    int num1 = 15;
    int num2 = 12;
    for(int i=num1;; i+=num1){
      if(i%num2 == 0){
        System.out.println(i);
      }
    }
  }
}
