package top.leetcode;

import java.util.Arrays;
import top.algorithms.MergeTwoArrays;
import top.algorithms.SelectionSort;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int[] firstArray = {9,3,1,0,6,4};
    int[] secondArray = {8,7,5,2,11,23};
    printArray(firstArray);
    printArray(secondArray);
    int[] result = MergeTwoArrays.mergeArrays(firstArray, secondArray);
    printArray(result);
  }

  static void printArray(int[] nums){
    System.out.println(Arrays.toString(nums));
  }

}
