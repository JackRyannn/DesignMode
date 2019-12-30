package BehaviorPattern.Mediator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mediator implements IMediator {

    Map<String,Renter> renterMap = new HashMap<String, Renter>();
    Map<String,Saler>  salerMap = new HashMap<String, Saler>();



    @Override
    public void addRenter(Renter renter) {
        renterMap.put(renter.getName(),renter);
    }

    @Override
    public void addSaler(Saler saler) {
        salerMap.put(saler.getName(),saler);
    }

    @Override
    public void send(Saler saler, String msg) {
        Iterator iterator = renterMap.values().iterator();
        while(iterator.hasNext()){
            Renter renter = (Renter)iterator.next();
            renter.receive(msg);
        }
    }

    @Override
    public void send(Renter renter, String msg) {
        Iterator iterator = salerMap.values().iterator();
        while(iterator.hasNext()){
            Saler saler = (Saler)iterator.next();
            saler.receive(msg);
        }
    }


}
