package ru.vsu.sc.tretyakov_d_s.Test;

public class TestCase {

  private int[] currentArr;
  private int correctResult;

  public TestCase(int[] currentArr, int correctResult) {
    this.currentArr = currentArr;
    this.correctResult = correctResult;
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

