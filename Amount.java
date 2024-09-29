// Класс для работы с суммами
public class Amount {
    double amount;                      // Сумма
    TransactionType transactionType;    // Тип операции

    // Конструктор
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    // Выводим информацию о транзакции
    @Override
    public String toString() {
        return transactionType + ": $" + amount;
    }
}




