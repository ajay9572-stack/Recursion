public class R5 {
    // sum of n th digit where n= 5
    public static void main(String[] args){
      int ans = sum(5);
      System.out.print(ans);
    }
    static int sum(int n){
        if (n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    
}
