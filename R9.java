public class R9 {
    // palindrom  no. or not
    public static void main(String[] args) {
        System.out.println(palindrom(12344321));
        
    }
    static int rev(int n){
        int digit =  (int)(Math.log10(n)+1);
        return healper(n, digit);
    }
    private static int healper(int n, int digit) {
      if(n%10 == n){
        return n;
      }
      int rem = n%10;
      return rem * (int) (Math.pow(10, digit-1)) + healper(n/10, digit-1);
    }
    static boolean palindrom(int n){
        return n == rev(n);
    }
    
}
