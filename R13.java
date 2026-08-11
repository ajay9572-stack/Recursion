public class R13 {
    // find target element of an array
    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 18, 9};
        System.out.println(find(arr,18,0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target, index+1);
    }
    
}
