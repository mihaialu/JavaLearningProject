package org.example.exceptionservicetask;

public class ArithmeticOperationService {
    public static double divideDataWithoutTryAndCatch(double a, double b){
        return a/b;
    }

    public static int divideDataWithTryAndCatch(int a, int b){
        try {
            return a/b;
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            return 0;
        }

    }
}
