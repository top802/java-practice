package top.algorithms;
/*
* The selection sort algorithm sorts an array by repeatedly finding the minimum element
* (considering ascending order) from unsorted part and putting it at the beginning.
*  The algorithm maintains two subarrays in a given array.

* - The subarray which is already sorted.
* - Remaining subarray which is unsorted.
* In every iteration of selection sort, the minimum element
* (considering ascending order) from the unsorted subarray
*  is picked and moved to the sorted subarray.
* */

public class SelectionSort {
  public static int[] selectionSortArray(int[] nums){
    // {25,15,30,45,5}
    int arrayLength = nums.length;
    int firstIteration = 0;
    int secondIteration = 0;
    int secondGeneralIteration = 0;
    for (int element = 0; element < arrayLength; element++){
      for(int index = 0; index < arrayLength - element - 1; index++){
        if (nums[index] > nums[index+1]) {
          swapArray(nums, nums[index], nums[index+1]);
        }
        secondGeneralIteration++;
        secondIteration++;
      }
      firstIteration++;
      System.out.println("firstIteration = " + firstIteration + "\n"
          + "secondIteration = " + secondIteration + "\n"
          + "secondGeneralIteration = " + secondGeneralIteration);
      secondIteration = 0;

    }
    return nums;
  }

  private static void swapArray(int[] nums, int a, int b) {
    int temp = a;
    nums[a] = nums[b];
    nums[b] = temp;
  }
}
