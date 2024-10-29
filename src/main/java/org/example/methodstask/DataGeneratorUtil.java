package org.example.methodstask;

import java.util.Random;

public class DataGeneratorUtil {

    static Random random = new Random();

    public static int getRandomInt(int startLimit, int endLimit) {
        Random random = new Random();
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + startLimit;
        return randomNumber;

    }

    public static int getRandomInt(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }

    public static String getRandomEmail(String emailDomain) {
        return UUID.randomUUID().toString() + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain) {

    }

    public static String getRandomEmail(String prefix, String emailDomain) {
        return prefix + DataGeneratorUtil.getRandomInt(limit:99) + emailDomain;
    }

}