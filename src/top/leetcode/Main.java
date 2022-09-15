package top.leetcode;

import java.util.Arrays;
import java.util.stream.Stream;
import top.algorithms.MergeTwoArrays;
import top.algorithms.SelectionSort;

public class Main {

  public static void main(String[] args) {
    // write your code here
//    int[] firstArray = {9,3,1,0,6,4};
//    int[] secondArray = {8,7,5,2,11,23};
//    printArray(firstArray);
//    printArray(secondArray);
//    int[] result = MergeTwoArrays.mergeArrays(firstArray, secondArray);
//    printArray(result);
    /**
     * for n = 10 Fibonacci sequence
     * 0 1 1 2 3 5 8 13 21 34*/
//    Stream.iterate(new int[]{0,1},
//        t -> new int[]{t[1], t[0]+t[1]})
//        .limit(10)
//        .map(t -> t[0])
//        .forEach(System.out::print);
  }

  static void printArray(int[] nums){
    System.out.println(Arrays.toString(nums));
  }

}
