public class R14 {
    // find target index of an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 18, 9};
        System.out.println(findIndex(arr, 18, 0));
        
    }
    static int findIndex(int[] arr, int target, int index){
        if(target == arr.length){
            return -1;
        }
        if (target == arr[index]){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
    
}
