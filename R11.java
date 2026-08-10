public class R11 {
    // count no. of steps 
    public static void main(String[] args) {
        System.out.println(step(41));
    }
    static int step (int num){
        return healper(num,0);
    }
    private static int healper(int num, int step) {
     if (num==0){
        return step;
     }
     if(num %2 ==0){
        return healper(num/2, step+1);
     }
     return healper (num-1,step+1);
    }
    
}
