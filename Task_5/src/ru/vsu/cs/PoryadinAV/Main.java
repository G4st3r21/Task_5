package ru.vsu.cs.PoryadinAV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number S: ");
        int s = readNumber();
        drawFigure(s);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 != 0 || number < 2) {
            printError();
            return readNumber();
        }

        return number;
    }

    private static void drawFigure(int s) {
        int maxNum = s / 2;

        printFirstHalf(maxNum);
        printLastHalf(maxNum);
    }

    private static void printFirstHalf(int maxNum) {
        for (int i = 0; i < maxNum; i++) {
            printSpace(maxNum - i);
            for (int j = 0; j < i + 1; j++) {
                printNumber(j);
            }
            goToNextLine();
        }
    }

    private static void printLastHalf(int maxNum) {
        for (int i = maxNum - 1; i >= 0; i--) {
            printSpace(maxNum + 1);
            for (int j = i; j >= 0; j--) {
                printNumber(j);
            }
            goToNextLine();
        }
    }

    private static void printSpace(int count) {
        for (int i = 0; i < count; i++) {System.out.print(" ");}
    }

    private static void printNumber(int number) {
        System.out.print(number);
    }

    private static void goToNextLine() {
        System.out.println();
    }

    private static void printError() {
        System.out.print("The number must be even and >= 2\nPlease, try again: ");
    }
}
