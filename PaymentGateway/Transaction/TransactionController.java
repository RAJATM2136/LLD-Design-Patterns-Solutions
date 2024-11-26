package Transaction;

import java.util.List;

public class TransactionController {
    TransactionService transactionService;
     public TransactionController() {
        this.transactionService = new TransactionService();
    }

    public TransactionDO makePayment(TransactionDO transactionDO) {
        return transactionService.makePayment(transactionDO);
    }

    public List<Transaction> getTransactionHistory(int userID) {
        return transactionService.getTransactionHistory(userID);
    }
}
