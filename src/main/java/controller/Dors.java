package controller;

import util.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * created by user violence
 * created on 14.02.2019
 * class created for project 100Dors
 */

public class Dors {
    public static Map<Integer, String> doors = new HashMap<>();
    public static void init() {
        for (int i = 1; i < 101; i++) {
            doors.put(i, Constants.CLOSE);
        }
    }

    public static void setDoors() {
        for (int i = 1; i < 101; i++) {
            for (int doorNumber = 1; doorNumber < 101; doorNumber++) {
                if (doorNumber % i == 0) {
                    String state = doors.get(doorNumber);
                    if (state.equals(Constants.CLOSE)) {
                        doors.put(doorNumber, Constants.OPEN);
                    } else {
                        doors.put(doorNumber, Constants.CLOSE);
                    }
                }
            }
        }
    }
    public static void printResult() {
        Map<Integer, String> open = new HashMap<>();
        Map<Integer, String> close = new HashMap<>();

        for (Map.Entry<Integer, String> entry : Dors.doors.entrySet()) {
            if (entry.getValue().equals(Constants.OPEN)) {
                open.put(entry.getKey(), entry.getValue());
            } else {
                close.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Open --> " + open.size());
        System.out.println("Close --> " + close.size());
    }
}
