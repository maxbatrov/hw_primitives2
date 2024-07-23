import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Бонусы за пополнение");
        int InitialAccount = 200;
        int amount = 300;
        int percent;
        if (amount > 1000) {
            percent = 1;
        } else  {
            percent = 0;
        }
        int bonus = amount / 100 * percent;
        int total = bonus + InitialAccount + amount;
        System.out.println("Баланс" + total);
    }
}