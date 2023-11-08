public class decToBin {
  public static void dToB(int n){
    while(n>0){
      int binNum = n%2;
      System.out.print(binNum+" ");
      n=n/2;
    }

  }
  public static void main(String[] args){
    dToB(7);
  }
  
}
