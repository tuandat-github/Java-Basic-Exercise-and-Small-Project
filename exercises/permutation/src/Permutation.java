public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printPermutn(arr,0);
    }
//    Write a permutation of [1, 2, 3] (permutation gives several possible variations, in which a set or number of things can be ordered or arranged).
//    Give an array with unique integers, print all permutations.
//    Example
//    Input: [1, 2], print 12, 21
//    Input: [1, 2, 3], print 123, 132, 213, 231, 312, 321.

    public static void printPermutn(int[] arr, int index) {
        if(index==arr.length-1){
            for(int i=0;i< arr.length;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        else{
            for(int i=index;i<arr.length;i++){
                //swap arr[i] vs arr[index]
                int tmp =arr[i];
                arr[i]=arr[index];
                arr[index]=tmp;
                printPermutn(arr, index+1);

                // swap arr[index] vs arr[i]
                arr[index]=arr[i];
                arr[i]=tmp;
            }
        }
    }
}


