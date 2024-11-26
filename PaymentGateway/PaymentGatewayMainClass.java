import Instrument.InstrumentController;
import Instrument.InstrumentDO;
import Instrument.InstrumentType;
import Transaction.Transaction;
import Transaction.TransactionController;
import Transaction.TransactionDO;
import User.UserController;
import User.UserDO;

import java.util.List;

public class PaymentGatewayMainClass {
    public static void main(String[] args) {

        InstrumentController ic = new InstrumentController();
        UserController uc = new UserController();
        TransactionController tc=new TransactionController();
        //add user 1
        UserDO user1 = new UserDO();
        user1.setUserName("Sender User1");
        user1.setEmail("daw");
        UserDO user1Details = uc.addUser(user1);

        //add user 2
        UserDO user2 = new UserDO();
        user2.setUserName("Sender User2");
        user2.setEmail("dawg");
        UserDO user2Details = uc.addUser(user2);

        //add bank to user 1
        InstrumentDO bankinstrumentDO=new InstrumentDO();
        bankinstrumentDO.setBankAccountNumber(1234);
        bankinstrumentDO.setInstrumentType(InstrumentType.BANK);
        bankinstrumentDO.setUserId(user1Details.getId());
        bankinstrumentDO.setIfdcCode(213);
        InstrumentDO user1BankInstrument=ic.add(bankinstrumentDO);
        System.out.println("bank ins for u1:"+user1BankInstrument.getInstrumentId());

        // add card for user 2
        InstrumentDO cardinstrumentDO=new InstrumentDO();
        cardinstrumentDO.setCardNumber(1234);
        cardinstrumentDO.setInstrumentType(InstrumentType.CARD);
        cardinstrumentDO.setUserId(user2Details.getId());
        cardinstrumentDO.setCvv(213);
        InstrumentDO user2CardInstrument=ic.add(cardinstrumentDO);
        System.out.println("card ins for u2:"+user2CardInstrument.getInstrumentId());

        //make payment

        TransactionDO transactionDO=new TransactionDO();
        transactionDO.setAmount(10);
        transactionDO.setSenderID(user1Details.getId());
        transactionDO.setReceiverID(user2Details.getId());
        transactionDO.setDebitInstrumentID(user1BankInstrument.getInstrumentId());
        transactionDO.setCreditInstrumentID(user2CardInstrument.getInstrumentId());
        //actual make payment
        tc.makePayment(transactionDO);
        //all ins of u1
        List<InstrumentDO> user1instruments=ic.getAllInstruments(user1Details.getId());
        user1instruments.stream().forEach(x->System.out.println("user1 instid: "+x.getInstrumentId()+": userID "+x.getUserId()+": instrument type:" +x.getInstrumentType().name()));

        //all ins of u2
        List<InstrumentDO> user2instruments=ic.getAllInstruments(user2Details.getId());
        user2instruments.stream().forEach(x->System.out.println("user2 instid: "+x.getInstrumentId()+": userID "+x.getUserId()+": instrument type:" +x.getInstrumentType().name()));

        //get all transction history
        List<Transaction> userTransactionHistory=tc.getTransactionHistory(user1Details.getId());

        userTransactionHistory.stream().forEach(x->System.out.println("user1 id "+x.getSenderID()+" ,txn id"+x.getTxnID()+": amount "+x.getAmount()+": receiver "+x.getReceiverID()));



    }
}
