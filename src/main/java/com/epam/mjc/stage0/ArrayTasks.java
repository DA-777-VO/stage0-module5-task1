package com.epam.mjc.stage0;

public class ArrayTasks {

    public String[] seasonsArray() {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        return seasons;
    }

    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i +1;
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        return numbers;
    }


    public int totalSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        return sum;

    }

    public int findIndexOfNumber(int[] arr, int number) {

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                total = i;
            } else {
                total = -1;
            }
        }

        System.out.println(total);


        return total;
    }


    public String[] reverseArray(String[] arr) {

        String[] array = new String[arr.length];

        for (int i = arr.length - 1; i >= 0 ; i--) {
            array[i] = arr[i];
            System.out.println(array[i]);
        }

        return array;

    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] array = new int[arr.length];
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                continue;
            }else {
                array[count]= arr[i];
                count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        return array;
    }

    public int[][] sortRaggedArray(int[][] arr) {

        return arr;
    }


}
