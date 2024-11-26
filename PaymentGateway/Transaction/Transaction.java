package Transaction;

public class Transaction {
    int txnID;
    int senderID;
    int receiverID;
    int debitInstrumentID;
    int creditInstrumentID;
    int amount;
    TransactionStatus status;

    public int getTxnID() {
        return txnID;
    }

    public void setTxnID(int txnID) {
        this.txnID = txnID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public int getDebitInstrumentID() {
        return debitInstrumentID;
    }

    public void setDebitInstrumentID(int debitInstrumentID) {
        this.debitInstrumentID = debitInstrumentID;
    }

    public int getCreditInstrumentID() {
        return creditInstrumentID;
    }

    public void setCreditInstrumentID(int creditInstrumentID) {
        this.creditInstrumentID = creditInstrumentID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
