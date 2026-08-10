public class R7 {
    // product of digit where n = 1342
    public static void main(String [] args){
       int ans = prod(1342);
       System.out.println(ans);
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)* prod(n/10);
    }
    
}
