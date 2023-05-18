package Exercise1;

import java.util.ArrayList;

/* 
 * Задание 1.
 * 1. Пусть дан произвольный список целых чисел
    1) Нужно удалить из него четные числа
    2) Найти минимальное значение
    3) Найти максимальное значение
    4) Найти среднее значение
 *
*/

public class Program {
    public static void main(String[] args) {
        // создаем список целых чисел
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);


        // удаляем четные числа из списка
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        // находим минимальное значение
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        // находим максимальное значение
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        // находим среднее значение
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.size();

        // выводим результаты
        System.out.println("Список чисел: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}