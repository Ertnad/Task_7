package ru.vsu.sc.tretyakov_d_s;

import ru.vsu.sc.tretyakov_d_s.Test.TestResult;

public class Main {

    public static void main(String[] args) {

        TestResult result = new TestResult();
        Solution solution = new Solution();

        if (result.testArray()) {

            int[] array = ArrayUtils.readIntArrayFromConsole();
            int count = solution.getNubmerOfElementsGreaterAverage(array);
            solution.printResult(array, count);

        } else {
            System.out.println("One or more tests fail, the program ends.");
        }
    }
}