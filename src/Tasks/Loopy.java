package Tasks; // Пример цикла while

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Перед началом цикла");
        while (x < 4) ;
        {
            System.out.println("внутри цикла");
            System.out.println("Значение х равно" + x);
            x = x + 1;
        }
        System.out.println("После окончания цикла");
    }
}
