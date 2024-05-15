package org.example;

public class Main {
    public static void main(String[] args) {int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(";");
                String sentence = "Мама мила раму";
                String[] words = sentence.split(" ");
                for (String word : words) {
                    System.out.println(word);
                    String text = "Я хочу перенесення рядків.";
                    String replacedText = text.replace(" ", "\n");
                    System.out.println(replacedText);
                    int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    for (i = 0; i < integers.length; i++) {
                        integers[i] *= 2;
                        double[] doubles = {3.14, 2.71, 1.618, 0.577, 1.414};
                        byte b = 10;
                        i = 20;
                        long l = 30L;
                        int[] mixedArray = {b, i, (int) l};
                        int[][] twoDimArray = {{1, 2, 3}, {4, 5, 6}};
                        for (int[] row : twoDimArray) {
                            for (int num : row) {
                                System.out.print(num + " ");
                            }
                            System.out.println();
                            String helloWorld = "Hello world!";
                            System.out.println(helloWorld.charAt(0));
                            System.out.println(helloWorld.charAt(helloWorld.length() - 1));

                            char[] worldArray = helloWorld.substring(6, 11).toCharArray();
                            System.out.println(worldArray);
                            System.out.println(worldArray[worldArray.length - 2]);

                            int c = 5;
                            int d = 10;

                            c++;
                            --d; 

                            System.out.println("c: " + c + ", d: " + d);
                        }
                    }
                }
            }
        }
    }
}