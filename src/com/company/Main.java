package com.company;

import java.lang.Math;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите диапазон рандомных чисел");
        int coef = in.nextInt();
        int num = -1 - coef;
        int num2 = coef + 1;
        int[] pos = new int[2];
        int[] pos2 = new int[2];
        int temp;
        int[][] array = new int[3][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round(Math.random() * coef);
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (num < array[i][j]) {
                    num = array[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
                if (num2 > array[i][j]) {
                    num2 = array[i][j];
                    pos2[0] = i;
                    pos2[1] = j;
                }
            }

        }
        System.out.println("-----");
        System.out.println(num + ", " + num2);
        System.out.println("-----");

        temp = array[pos[0]][pos[1]];
        array[pos[0]][pos[1]] = array[pos2[0]][pos2[1]];
        array[pos2[0]][pos2[1]] = temp;

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }

    }
}
