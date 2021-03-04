import java.util.Arrays;


//arr = [1,2,3,4,5,6,7] , k=3
//      [7,6,5,4,3,2,1]
//->    [5,6,7,1,2,3,4]
public class ExerciseOnArrays {

    public static void rotateArrBy_K_Steps(int [] nums , int k){
        k%= nums.length;
        reverseArray(nums,0, nums.length-1);
        reverseArray(nums,0 , k-1);
        reverseArray(nums,k , nums.length-1);
    }
    
    private static void reverseArray(int[] nums,int start, int end) {
        int temp;
        for (int i = start; i < end; i++) {
        temp = nums[i];
        nums[i]= nums[end];
        nums[end--]=temp;
        }
    }
    // Search two indexes in an array whose sum is equal to the target
    public static int[] findIndexesOfSumOfTarget(int[] nums , int target){
        for(int i=0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static int  EraseDuplicate (int [] sortArr , int n){
        // input [0,0,1,1,1,2,5]
        // output [0,1,2,5]
        if(n ==0 || n == 1) return n;
        int k = 0;

        for (int i = 0; i < sortArr.length-1; i++) {
            if(sortArr[i] != sortArr[i+1]){
                sortArr[k++] = sortArr[i];
            }
        }
        sortArr[k++] = sortArr[sortArr.length-1];
        return k;
    }
}
