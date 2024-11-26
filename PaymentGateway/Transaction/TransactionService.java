package Transaction;

import Instrument.InstrumentController;
import Instrument.InstrumentDO;

import java.util.*;

public class TransactionService {
    public static Map<Integer, List<Transaction>> userVsTrasnactionlist;
    Processor processor;
    InstrumentController instrumentController;
    TransactionService(){
        userVsTrasnactionlist=new HashMap<Integer, List<Transaction>>();
        processor=new Processor();
        instrumentController=new InstrumentController();
    }

    public List<Transaction> getTransactionHistory(int userID){
        return userVsTrasnactionlist.get(userID);
    }
    public TransactionDO makePayment(TransactionDO transactionDO){
    // validate if all field are present in transactionDO
        InstrumentDO senderInstrumentDO= instrumentController.getInstrumentById(transactionDO.senderID,transactionDO.debitInstrumentID);
        InstrumentDO receiverInstrumentDO=instrumentController.getInstrumentById(transactionDO.receiverID, transactionDO.creditInstrumentID);
        processor.makePayment(senderInstrumentDO,receiverInstrumentDO);

        Transaction txn=new Transaction();
        txn.amount=transactionDO.amount;
        txn.debitInstrumentID=transactionDO.debitInstrumentID;
        txn.creditInstrumentID=transactionDO.creditInstrumentID;
        txn.senderID=transactionDO.senderID;
        txn.receiverID=transactionDO.receiverID;
        txn.txnID=(new Random().nextInt(100-10)+10);
        txn.status=TransactionStatus.SUCCESS;

        //history

        List<Transaction> senderTxnsLisst=userVsTrasnactionlist.get(txn.senderID);
        if(senderTxnsLisst==null){
            senderTxnsLisst=new ArrayList<Transaction>();
            userVsTrasnactionlist.put(txn.senderID,senderTxnsLisst);
        }
        senderTxnsLisst.add(txn);


        List<Transaction> receiverTxnsLisst=userVsTrasnactionlist.get(txn.receiverID);
        if(receiverTxnsLisst==null){
            receiverTxnsLisst=new ArrayList<Transaction>();
            userVsTrasnactionlist.put(txn.receiverID,receiverTxnsLisst);
        }
        receiverTxnsLisst.add(txn);
        transactionDO.txnID=txn.txnID;
        transactionDO.status=txn.status;
        return transactionDO;
    }
}
