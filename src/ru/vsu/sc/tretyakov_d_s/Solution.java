package ru.vsu.sc.tretyakov_d_s;

import java.util.Arrays;

public class Solution {

  public int getNubmerOfElementsGreaterAverage(int[] array) {

    int count = 0;

    if (checkArrayForRepeats(array)) {

      sortingArray(array);

      int average = getArrayAverage(array);

      for (int i = 1; i < array.length; i++) {
        if (array[i] >= average) {
          count += 1;
        }
      }
    }
    return count;
  }

  public void printResult(int[] array, int count) {
    System.out.printf("For array %s the result %s", Arrays.toString(array), count);
  }

  private void sortingArray(int[] array) {

    for (int left = 0; left < array.length; left++) {
      int value = array[left];
      int i = left - 1;
      for (; i >= 0; i--) {
        if (value < array[i]) {
          array[i + 1] = array[i];
        } else {
          break;
        }
      }
      array[i + 1] = value;
    }
  }

  private int getArrayAverage(int[] array) {

    int average = 0;
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    average = sum / array.length;

    return average;
  }

  private boolean checkArrayForRepeats(int[] array) {

    int k = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          k += 1;
          if (k == array.length) {
            return false;
          }
        }
      }
    }

    return true;
  }
}
