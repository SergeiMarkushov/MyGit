package ru.company;

/*
Условие:

Создайте массив из всех чётных чисел от 2 до 20
и выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом, а затем в столбик
(отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
2 4 6 … 18 20
2
4
6
…
20
 */
public class Main {
    public static void  FirstArray (){
        int[] array = new int[21];
        for (int i = 1; i < 21; i++) {
            array[i] = i;

            if ((array[i] % 2) == 0){
                System.out.print(array[i]+" ");

            }
        }
    }
    public static void SecondArray (){
        int[] array = new int[21];
        for (int i = 3; i < 21; i++) {
            array[i] = i;


            if ((array[i] % 2) == 0){
                System.out.println(array[i]+" ");
            }
        }

    }



    public static void main(String args[]){

        FirstArray();
        System.out.println();
        SecondArray();
    }
}

