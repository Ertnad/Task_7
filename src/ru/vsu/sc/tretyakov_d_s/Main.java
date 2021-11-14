package ru.vsu.sc.tretyakov_d_s;

import java.util.Arrays;
import ru.vsu.sc.tretyakov_d_s.Test.ArrayTest;
import ru.vsu.sc.tretyakov_d_s.Test.TestResult;

public class Main {

    public static void main(String[] args) {

        ArrayTest test = new ArrayTest();
        TestResult result = test.checkArray();
        Solution solution = new Solution();

        printTestResult(result);

        if (result.getIsProgramCorrect()) {

            int[] array = ArrayUtils.readIntArrayFromConsole();
            int count = solution.getNubmerOfElementsGreaterAverage(array);
            printResult(array, count);

        }
    }

    private static void printResult(int[] array, int count) {
        System.out.printf("For array %s the result %s", Arrays.toString(array), count);
    }

    private static void printTestResult(TestResult result) {
        if (result.getIsProgramCorrect()){
            System.out.println("The tests were successful, you can continue the program");
        } else {
            System.out.printf("The test for array %s failed,"
                + " you cannot continue the program", result.getErrorArray());
        }
    }
}