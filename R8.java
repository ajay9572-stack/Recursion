public class R8 {
    // reverse a no.
    public static void main(String[] args) {
        System.out.println(rev(1234));
        
    }
    static int rev(int n){
        int digit =  (int)(Math.log10(n)+1);
        return healper(n, digit);
    }
    // sometime you might need some additional variable in the argument in case, make another function 
    private static int healper(int n, int digit) {
      if(n%10 == n){
        return n;
      }
      int rem = n%10;
      return rem * (int) (Math.pow(10, digit-1)) + healper(n/10, digit-1);
    }
    
}
