package hw03;

import java.util.Scanner;

/**
 * Created by Rain on 25.06.2016.
 */
public class Solution {
    public static void main(String[] args) {
       /* -------------------------------------------------- Последовательности --------------------------------------------------*/
//        1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        int j;
        for (int i = 0; i < 200; i++) {
            if (i % 3 == 0) {
                j = i + 1000;
                System.out.print(j + " ");
//            }
//        }
//        2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
                for (int i = 1; i < 110; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
//            }
//        }
//        3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
                        for (int i = 90; i > 0; i--) {
                            if (i % 5 == 0) {
                                System.out.print(i + " ");
//            }
//        }
//        4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …
                                int j = 2;
                                for (int i = 1; i <= 20; i++, j = j * 2) {
                                    System.out.print(j + " ");
                                }
//        5. Выведите на экран первые 20 членов последовательности Фибоначчи.

                                int n = 20;
                                int a = 1, b = 1;
                                System.out.print(a + " " + b);
                                int fib = 2, i = 2;
                                while (i < n) {
                                    fib = a + b;
                                    a = b;
                                    b = fib;
                                    System.out.print(" " + fib);
                                    i++;
                                }

                                /**
                                 * -------------------------------------------------- Системы счисления ---------------------------------------------------
                                 */

//6. Написать программу, которая реализует следующий функционал:
//        6.1 Пользователь вводит число в 10-ой системе счисления.
//        6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
//        1) в 2-ую
//        2) в 8-ую
//        3) в 16-ую
//        6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
//        на экран результат.

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Введите число в 10-ой системе счисления: ");
//
//        int number = scan.nextInt();
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.print("Введите в какую систему перевести число: 1)в 2-ую 2)в 8-ую 3)в 16-ую ");
//        int in1 = scan1.nextInt();
//        byte b = 0;





/*----------------------------------------------------- Творчество -------------------------------------------------------*/
//        В этом блоке задач используйте минимальный вывод в строку, то есть "Ж " или "- ", а не целыми строками
//        "Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -". Комбинируйте вложенными циклами и условиями if или switch.
//
//        7. Выведите в консоль "шахматную доску" размером 32х32 знаков(пробелы не учитывать). Например:
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//        - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
//
/*       -------------------------------------------- Факториал и делители числа ------------------------------------------------*/
//        8. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
//        9. Выведите на экран все положительные делители натурального числа, введенного пользователем.

                            }
                        }