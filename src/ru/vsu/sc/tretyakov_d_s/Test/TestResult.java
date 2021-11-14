package ru.vsu.sc.tretyakov_d_s.Test;

import java.util.Arrays;

public class TestResult {

  private final boolean isProgramCorrect;
  private final TestCase errorArray;

  public TestResult(boolean isProgramCorrect, TestCase errorArray) {
    this.isProgramCorrect = isProgramCorrect;
    this.errorArray = errorArray;
  }

  public boolean getIsProgramCorrect() {
    return isProgramCorrect;
  }

  public String getErrorArray() {
    return Arrays.toString(errorArray.getCurrentArr());
  }


}