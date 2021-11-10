package ru.vsu.sc.tretyakov_d_s.Test;

import java.util.Arrays;
import ru.vsu.sc.tretyakov_d_s.Solution;

public class TestResult {

  public boolean testArray() {

    boolean result = true;

    TestCase[] test;
    TestCase array = new TestCase();
    test = array.getTestCases();
    Solution solution = new Solution();

    for (TestCase aCase: test) {

      int currentResult = solution.getNubmerOfElementsGreaterAverage(aCase.getCurrentArr());
      int correctResult = aCase.getCorrectResult();
      String currentArray = Arrays.toString(aCase.getCurrentArr());

      if (currentResult != correctResult) {
          result = false;
      }

      printResultForTest(result, currentResult, currentArray, correctResult);
    }

    return result;
  }

  private void printResultForTest(boolean result, int currentResult,
      String currentArray, int correctResult) {

    if (!result) {
      System.out.printf("[Error] For array %s the result: %s. Correct result: %s. \n",
          currentArray, currentResult, correctResult);
    } else {
      System.out.printf("[Correct] For array %s the result: %s. Correct result: %s. \n",
          currentArray, currentResult, correctResult);
    }
  }

}


