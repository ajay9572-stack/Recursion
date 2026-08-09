public class R3 {
    //print 1 2 3 4 5 when n=5
    public static void main(String [] args){
     fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
