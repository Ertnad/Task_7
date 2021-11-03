package ru.vsu.sc.tretyakov_d_s.Test;

public class TestCase {

  private int[] currentArr;
  private int correctResult;

  public TestCase[] getTestCases() {
    TestCase[] test = new TestCase[10];
    test[0] = new TestCase(new int[]{0, 0, 0, 0, 0}, 0);
    test[1] = new TestCase(new int[]{0, 0, 0, 0, 1}, 0);
    test[2] = new TestCase(new int[]{10, 10, 10, 10, 10}, 0);
    test[3] = new TestCase(new int[]{1, 2, 3, 4, 5}, 3);
    test[4] = new TestCase(new int[]{5, 4, 3, 2, 1}, 3);
    test[5] = new TestCase(new int[]{-1, -2, -3, -4, -5}, 3);
    test[6] = new TestCase(new int[]{-5, -4, -3, -2, -1}, 3);
    test[7] = new TestCase(new int[]{1, 3, 3, 6, 9}, 2);
    test[8] = new TestCase(new int[]{2, -1, 3, 8, 10}, 2);
    test[9] = new TestCase(new int[]{4, 5, 6, 5, 2}, 4);
    return test;
  }

  public TestCase(int[] currentArr, int correctResult) {
    this.currentArr = currentArr;
    this.correctResult = correctResult;
  }

  public TestCase() {
  }

  public int[] getCurrentArr() {
    return currentArr;
  }

  public void setCurrentArr(int[] currentArr) {
    this.currentArr = currentArr;
  }

  public int getCorrectResult() {
    return correctResult;
  }

  public void setCorrectResult(int correctResult) {
    this.correctResult = correctResult;
  }

}

