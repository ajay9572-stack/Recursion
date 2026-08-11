public class R15 {
    // find target index from last of an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 18, 9};
        System.out.println(findIndexLast(arr, 18, arr.length-1));
        
    }
    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if (target == arr[index]){
            return index;
        } else{
           return findIndexLast(arr, target, index-1);
        }
       
    }
    
}
