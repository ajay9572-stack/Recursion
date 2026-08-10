public class R4{
    // factorial of a no where n=5
    public static void main (String[] args){
       int ans = fact(5);
       System.out.print(ans);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n* fact(n-1);
    }
}