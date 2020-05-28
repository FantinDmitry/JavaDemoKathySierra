package Tasks; // Пример цикла while

public class Loopy {
    public static void main(String[] args) {
        int x = 1;    // Перед началом цикла
        System.out.println("Значение х равно" + x);
        while (x < 3) {
            x = x + 1;
            System.out.println("Значение х равно" + x);
        }


    }
}

//Java Loopy
// Перед началом цикла
// Внутри цикла
// Значение х = 1
// Внутри цикла             ЭТО РЕЗУЛЬТАТ РАБОТЫ ЦИКЛА.
// Значение х = 2
// Внутри цикла
// Значение х = 3
// После окончания цикла.