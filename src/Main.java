public class Main {
    public static void main(String[] args) {

        int current_account = 100;
        int addin_funds = 500;
        int bonus = 0;
        int amount;

        if (addin_funds > 1000) {
            bonus = addin_funds / 100;
        }

        amount = current_account + addin_funds + bonus;
        System.out.println("Итоговый счет после пополнения: " + amount);

    }
}