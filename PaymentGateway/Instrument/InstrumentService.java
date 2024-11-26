package Instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {  //abstract because bank service and card service have diff implementation of these fn.

    static Map<Integer, List<InstrumentEntity>> instruments = new HashMap<>();  //each user can have list of instruments

    public abstract InstrumentDO addInstrument(InstrumentDO instrumentDO);

    public abstract List<InstrumentDO> getInstrument(int id);

}
