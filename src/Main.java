public class Main {
    public static void main(String[] args) {

        int ticketSell = 5000; // цена билета

        if (ticketSell < 0) {
            ticketSell = 0;
        }
        int milesNumber = ticketSell / 20; // колиество начисляемых миль
        System.out.println(milesNumber);
    }
}