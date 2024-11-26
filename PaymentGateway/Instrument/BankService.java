package Instrument;

import java.util.*;

public class BankService extends InstrumentService{
    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
        //bank related logic to add
        BankInstrument bankInstrument = new BankInstrument();
        bankInstrument.instrumentId=new Random().nextInt(100-10)+10;
        bankInstrument.instrumentType=InstrumentType.BANK;
        bankInstrument.userId=instrumentDO.userId;
        bankInstrument.accNo=instrumentDO.bankAccountNumber;
        bankInstrument.ifdcCode=instrumentDO.ifdcCode;

        List<InstrumentEntity> userInstrumentList=instruments.get(bankInstrument.userId);

        if(userInstrumentList==null){
            userInstrumentList=new ArrayList<>();
            instruments.put(bankInstrument.userId,userInstrumentList);
        }
        userInstrumentList.add(bankInstrument);
        return mapBankinstrumentTOInstrumentDo(bankInstrument);
    }

    private InstrumentDO mapBankinstrumentTOInstrumentDo(BankInstrument bankInstrument) {
    InstrumentDO instrumentDO=new InstrumentDO();
    instrumentDO.instrumentId=bankInstrument.instrumentId;
    instrumentDO.instrumentType=bankInstrument.instrumentType;
    instrumentDO.userId=bankInstrument.userId;
    instrumentDO.bankAccountNumber=bankInstrument.accNo;
    instrumentDO.ifdcCode=bankInstrument.ifdcCode;
    return instrumentDO;
    }

    @Override
    public List<InstrumentDO> getInstrument(int id) {
        List<InstrumentEntity> userInstrumentList=instruments.get(id);
        List<InstrumentDO> userInstrumentsFetched=new ArrayList<>();
        for(InstrumentEntity instrumentEntity:userInstrumentList){
            if(instrumentEntity.instrumentType==InstrumentType.BANK){
                userInstrumentsFetched.add(mapBankinstrumentTOInstrumentDo((BankInstrument)instrumentEntity));
            }
        }
        return userInstrumentsFetched;
    }
}
