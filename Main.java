public class Main {
    public static void main(String[] args) {
        // Создаем аккаунт
        PersonalAccount account = new PersonalAccount(123456, "Уранбек");

        // Тест 1: Проверка начального баланса
        System.out.println("Начальный баланс: $" + account.getBalance()); // Ожидалось: $0.0

        // Тест 2: Пополнение счета
        account.deposit(200.0);
        System.out.println("Баланс после депозита $200: $" + account.getBalance()); // Ожидалось: $200.0

        // Тест 3: Снятие средств
        account.withdraw(50.0);
        System.out.println("Баланс после снятия $50: $" + account.getBalance()); // Ожидалось: $150.0

        // Тест 4: Попытка снять больше, чем есть на счету
        account.withdraw(200.0); // Ожидаем сообщение об ошибке
        System.out.println("Баланс после неудачной попытки снятия: $" + account.getBalance()); // Ожидалось: $150.0

        // Тест 5: Печать истории транзакций
        System.out.println("История транзакций:");
        account.printTransactionHistory(); // Проверяем историю транзакций
    }
}


