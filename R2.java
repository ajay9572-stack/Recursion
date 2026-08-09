public class R2{
    //print 5 4 3 2 1 when n= 5
    public static void main(String[] args){
     fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}