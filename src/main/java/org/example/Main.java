package org.example;

public class Main {

    // 1. Двозначне число. Перестановка цифр.
    public int swapDigits(int number) {
        if (number < 10 || number > 99) {
            throw new IllegalArgumentException("Number must be a two-digit integer.");
        }
        int tens = number / 10;
        int ones = number % 10;
        return ones * 10 + tens;
    }

    // 2. Перевірити істинність: кожне число A і B непарне.
    public boolean bothOdd(int a, int b) {
        return a % 2 != 0 && b % 2 != 0;
    }

    // 3. Вивести спочатку більше, а потім менше з двох чисел.
    public int[] sortTwoNumbers(int a, int b) {
        if (a > b) {
            return new int[]{a, b};
        }
        return new int[]{b, a};
    }

    // 4. Вивести дату, що передує зазначеній.
    public int[] previousDate(int day, int month) {
        if (day <= 0 || month <= 0 || month > 12) {
            throw new IllegalArgumentException("Invalid date.");
        }

        if (day == 1) {
            if (month == 3) { // Березень
                return new int[]{28, 2};
            } else if (month == 1) { // Січень
                return new int[]{31, 12};
            } else if (month == 5 || month == 7 || month == 10 || month == 12) {
                return new int[]{30, month - 1};
            } else {
                return new int[]{31, month - 1};
            }
        }
        return new int[]{day - 1, month};
    }

    // 5. Добуток всіх цілих чисел від A до B включно.
    public int productInRange(int a, int b) {
        if (a >= b) {
            throw new IllegalArgumentException("A must be less than B.");
        }
        int product = 1;
        for (int i = a; i <= b; i++) {
            product *= i;
        }
        return product;
    }

    // 6. Найбільше ціле число K, квадрат якого не перевищує N.
    public int largestSquare(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be greater than 0.");
        }
        int k = 0;
        while (k * k <= n) {
            k++;
        }
        return k - 1;
    }

    // 7. Вивести всі парні пари масиву у порядку спадання індексів.
    public String evenPairs(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % 2 == 0 && array[i - 1] % 2 == 0) {
                result.append("(").append(array[i - 1]).append(", ").append(array[i]).append(") ");
            }
        }
        return result.toString().trim();
    }

    // 8. Вивести елементи K-го стовпця матриці.
    public int[] columnElements(int[][] matrix, int k) {
        if (k < 1 || k > matrix[0].length) {
            throw new IllegalArgumentException("Invalid column index.");
        }
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][k - 1];
        }
        return column;
    }
}
