package ru.vsu.sc.tretyakov_d_s;

import ru.vsu.sc.tretyakov_d_s.Test.TestResult;

public class Main {

    public static void main(String[] args) {

        TestResult result = new TestResult();

        if (result.testArray()) {

            int[] array = ArrayUtils.readIntArrayFromConsole();
            int count = result.getNubmerOfElementsGreaterAverage(array);
            System.out.printf("For this array the result: %s.", count);

        } else {
            System.out.println("One or more tests fail, the program ends.");
        }
    }

}



