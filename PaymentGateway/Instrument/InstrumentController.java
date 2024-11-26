package Instrument;

import java.util.ArrayList;
import java.util.List;

public class InstrumentController {
    InstrumentFactory instrumentFactory;
    public InstrumentController(){
        instrumentFactory = new InstrumentFactory();
    }

    public InstrumentDO add(InstrumentDO instrumentDO){
        InstrumentService instrumentService=instrumentFactory.getInstrumentService(instrumentDO.instrumentType);
        return instrumentService.addInstrument(instrumentDO);
    }

    public List<InstrumentDO> getAllInstruments(int userId){
        InstrumentService bankInstrumentService=instrumentFactory.getInstrumentService(InstrumentType.BANK);
        InstrumentService cardInstrumentService=instrumentFactory.getInstrumentService(InstrumentType.CARD);
        List<InstrumentDO> instrumentDOList=bankInstrumentService.getInstrument(userId);
        instrumentDOList.addAll(cardInstrumentService.getInstrument(userId));
        return instrumentDOList;
    }


    public InstrumentDO getInstrumentById(int id,int instrumentId){
            List<InstrumentDO> instrumentDOList=getAllInstruments(id);
            for(InstrumentDO instrumentDO:instrumentDOList){
                if(instrumentDO.instrumentId==instrumentId){
                    return instrumentDO;
                }
            }
            return null;
    }

}
