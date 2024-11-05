package org.example.exceptionservicetask;

public class RunTask {

    public static void main(String[] args) {
        int stringLength = TextManager.getTheTextLengthWithoutTryAndCatch("Muschi");
        System.out.println(stringLength);

        String data = null;
        System.out.println(TextManager .getTheTextLengthWithTryAndCatch(data));
        System.out.println("I am happy and i know it");

        System.out.println(ArithmeticOperationService.divideDataWithoutTryAndCatch(10,5));
        System.out.println(ArithmeticOperationService.divideDataWithTryAndCatch(10,0));
        System.out.println("The code is fine, the execution is good");

    }

}
