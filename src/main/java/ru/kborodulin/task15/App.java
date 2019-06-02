package ru.kborodulin.task15;

/**
 * Дан двумерный массив. Задача – написать метод
 * <p>
 * public void toLeft() {}
 * 1.Пройти с 1-ой до последней строки
 * 2.Пройти с 1-го до предпоследнего элемента
 * 3.В текущую ячейку поместить значение следующей
 * 4.Последнему элементу присвоить 0
 * <p>
 * Так выглядит любая строка после преобразования данным методом
 */
public class App {
    public int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {3, 4, 3, 4, 5, 6, 7, 8, 9, 10}, {10, 20, 3, 4, 5, 6, 7, 8, 9, 10}};

    public static void main(String[] args) {
        App app = new App();
        app.toLeft();
    }

    public void toLeft() {
        for (int line = 0; line < array.length; line++) {
            // Перебор массива до предпоследнего элемента
            for (int column = 0; column < array[line].length - 2; column++) {
                array[line][column] = array[line][column + 1];
                System.out.print(array[line][column] + " ");
            }
            // Последнему элементу массива присваиваем 0
            for (int column = array[line].length - 1; column > 0; column--) {
                array[line][column] = 0;
                System.out.print(array[line][column] + " ");
                break;
            }
            System.out.println("");
        }
    }
}