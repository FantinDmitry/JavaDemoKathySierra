package Tasks;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок (бутылок)";

        while (beerNum > 0)  {

            if (beerNum ==1) {
                word = "бутылка"; // В единственном числе - одна бутылка.
            }
            System.out.println(beerNum + "" + word + " пива на стене");
            System.out.println(beerNum + "" + "пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + "" + word + "пива на стене");
            } else {
                if (beerNum == 0);
                System.out.println("Нет бутылок пива на стене");

            } // Конец else
        } // Конец цикла while
    }  // Конец метода Main
}  // Конец класса
