public class binarySearch {
    /*
    * Search for the target in a sorted array, and return the index. If the target is not in this array, return -1.
    Example:
    Input: [1, 5, 7, 8, 9, 11, 18, 19, 20, 25], target=11, output=5.
    Input: [1, 2, 3, 4, 5], target=10, output=-1
    * */
    public static int findTarget(int[] arr, int target){
        if (arr.length==0) return -1;
        int start =0,i;
        int end = arr.length-1;
        while(start<=end){
            i=(start+end)/2;
            if(arr[i]==target){
                return i;
            }
            else if(arr[i]<target){
                start=i+1;
            }
            else{
                end=i-1;
            }
        }
        return -1;
    }
}
