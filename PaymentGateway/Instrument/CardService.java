package Instrument;

import javax.sound.midi.Instrument;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService{
    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
    //card related logic to add
        CardInstrument card = new CardInstrument();
        card.cardNumber=instrumentDO.cardNumber;
        card.instrumentType=instrumentDO.instrumentType;
        card.instrumentId=new Random().nextInt(100-10)+10;
        card.cvv=instrumentDO.cvv;
        card.userId=instrumentDO.userId;
        List<InstrumentEntity> userInstrumentList=instruments.get(instrumentDO.userId);
        if(userInstrumentList==null){
            userInstrumentList=new ArrayList<InstrumentEntity>();
            instruments.put(instrumentDO.userId,userInstrumentList);
        }
        userInstrumentList.add(card);
        return mapCardInstrumentToInstrumentDo(card);
    }

    private InstrumentDO mapCardInstrumentToInstrumentDo(CardInstrument cardInstrument) {
        InstrumentDO instrumentDO=new InstrumentDO();
        instrumentDO.instrumentId=cardInstrument.instrumentId;
        instrumentDO.instrumentType=cardInstrument.instrumentType;
        instrumentDO.userId=cardInstrument.userId;
        instrumentDO.cvv=cardInstrument.cvv;
        instrumentDO.cardNumber=cardInstrument.cardNumber;
        return instrumentDO;
    }

    @Override
    public List<InstrumentDO> getInstrument(int id) {
        List<InstrumentEntity> userInstrumentList=instruments.get(id);
        List<InstrumentDO> userInstrumentsFetched=new ArrayList<>();
        for(InstrumentEntity instrumentEntity:userInstrumentList) {
            if (instrumentEntity.instrumentType == InstrumentType.CARD) {
                userInstrumentsFetched.add(mapCardInstrumentToInstrumentDo((CardInstrument) instrumentEntity));
            }
        }
    return userInstrumentsFetched;
    }
}
