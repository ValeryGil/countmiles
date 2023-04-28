public class Main {
    public static void main(String[] args) {

        int ticket = 17_240; // Стоимость билета
        int priceMile = 20; // Стоимость одной мили

        int countMiles = ticket / priceMile; // Расчет миль
        System.out.println("Количество начисленных миль = " + countMiles);
    }
}
