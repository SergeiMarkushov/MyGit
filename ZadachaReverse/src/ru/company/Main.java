package ru.company;

  /*
        Условие:
        1. Считывает целое число N с клавиатуры.
        2. Если считанное число N больше 0, то программа дальше считывает целые числа,
        количество которых равно N.
        3. Вывести в консоль считанные числа, если N нечетное - впорядке ввода, иначе в обратном порядке.
        4. Каждое число N выводить с новой строки.
        число N выводить не нужно.

        Требования:
        1. Программа должна считывать число N и за ним еще N чисел.
        2. В классе должен быть метод public static void main(String[]args).
        3. Нельзя добавлять новые методы в класс Main.
        4. Программа должна выводить введенные N чисел в обратном порядке,
        если N четное.
        5. Программа должна выводить введенные N чисел в том же порядке,
        если N нечетное.
         */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // включаем сканнер
        System.out.println("Enter the number more then 0 ");
        int N = scanner.nextInt(); // вводится целое число N
        System.out.println("Enter the numbers " + N + " times");
        int[] array = new int[N];


                for (int i = 0; i < N; i++) {
                    array[i] = scanner.nextInt(); // создаём числа для массива
                }

                if ((N%2) ==0) { // первое условие если N четное
                  
                    for (int i = array.length-1; i >= 0; i--)
                        System.out.println(array[i]);


                } else // условие если N нечетное
                    {
                        for (int i = 0; i < N; i++){
                       
                            System.out.println(array[i]);
                        }
                    }
                }
}
