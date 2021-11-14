package ru.vsu.sc.tretyakov_d_s.Test;

import ru.vsu.sc.tretyakov_d_s.Solution;

public class ArrayTest {

  public TestResult checkArray() {

    StorageOfTests array = new StorageOfTests();
    TestCase[] test = array.getTestCase();
    Solution solution = new Solution();

    for (TestCase aCase : test) {

      int currentResult = solution.getNubmerOfElementsGreaterAverage(aCase.getCurrentArr());
      int correctResult = aCase.getCorrectResult();


      if (currentResult != correctResult) {
        return new TestResult(false, aCase);
      }
    }
    return new TestResult(true, null);
  }
}
