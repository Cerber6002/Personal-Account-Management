// Класс для банковского счета
public class PersonalAccount {
    int accountNumber;              // Номер счета
    String accountHolder;           // Имя владельца счета
    double balance;                 // Баланс
    Amount[] transactions;          // Массив транзакций
    int transactionCount;           // Счетчик транзакций

    // Конструктор счета
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;                // Начальный баланс
        this.transactions = new Amount[100];  // Массив на 100 операций
        this.transactionCount = 0;         // Начальное число транзакций
    }

    // Депозит
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Увеличиваем баланс
            transactions[transactionCount++] = new Amount(amount, TransactionType.DEPOSIT);
        } else {
            System.out.println("Неверная сумма.");
        }
    }

    // Снятие денег
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Уменьшаем баланс
            transactions[transactionCount++] = new Amount(amount, TransactionType.WITHDRAWAL);
        } else {
            System.out.println("Недостаточно средств.");
        }
    }

    // Печать истории транзакций
    public void printTransactionHistory() {
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }

    // Получить текущий баланс
    public double getBalance() {
        return balance;
    }

    // Получить номер счета
    public int getAccountNumber() {
        return accountNumber;
    }

    // Получить имя владельца
    public String getAccountHolder() {
        return accountHolder;
    }
}
