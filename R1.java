public class R1{
    // find nth fabonaci no.
    public static void main(String [] args){
      System.out.print(fibo(7));      // here in fibo(7); 7 show the position of fabonaci series
    }
    static int fibo(int n){
      if (n<2){
        return n;
      }
      return fibo(n-1)+ fibo(n-2);
    }
}