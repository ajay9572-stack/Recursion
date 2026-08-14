package Shorting;

import java.util.Arrays;
// merge shorting

public class RS3 {
    public static void main(String[] args) {
        int[] arr ={8, 3, 4, 12, 5, 6};
         arr = mergeShort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static int[] mergeShort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] first = mergeShort(Arrays.copyOfRange(arr, 0, mid));
        int[] second = mergeShort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first,second);          // Merging the two sorted arrays
    }
    private static int[] merge(int[] first, int[] second) {          // Method to merge two sorted arrays
       int[] mix = new int[first.length+ second.length];             // Creating a new array to store the merged result
 
        int i= 0;                         // pointer for first array
        int j= 0;                       //  pointer for second array
        int k =0;                        // pointer for result array

       while (i< first.length && j< second.length) {            // Compare elements of both arrays until one array is completely traversed
        if(first[i]< second[j]){                                // If element of first array is smaller
            mix [k]= first[i];                                  // Put first array element into mix
            i++;                                                  // Move first array pointer
        }else{
            mix[k]= second[j];
            j++;
        }
        k++;                       // Move result array pointer
       }
       while (i< first.length) {                  // If elements are remaining in first array, copy them into mix
        mix[k] = first[i];
        i++;
        k++;    
       }
        while (j< second.length) {
        mix[k] = second[j];
        j++;
        k++;    
       }
    return mix;
    }
     
}
