package top.algorithms;
/*
* in this case need to merge two different arrays
* one {3,2,7,1} and other {0,9,8,4,5,6}
* as a result we get {3,2,7,1,0,9,8,4,5,6}
* */
public class MergeTwoArrays {
  public static int[] mergeArrays(int[] firstArray, int[] secondArray){
    int firstArrayLength = firstArray.length;
    int secondArrayLength = secondArray.length;
    int[] mergedArray = new int[firstArrayLength + secondArrayLength];
    for(int element = 0; element < firstArrayLength; element++){
      mergedArray[element] = firstArray[element];
    }
    for(int element = firstArrayLength; element < mergedArray.length; element++){
      mergedArray[element] = secondArray[mergedArray.length - secondArrayLength - firstArrayLength];
      secondArrayLength--;
    }
    return mergedArray;
  }
}
