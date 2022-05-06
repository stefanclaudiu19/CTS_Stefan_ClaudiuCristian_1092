package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler handleAutobuz = new AutobuzHandler();
        MijlocTransportHandler handlerMetrou = new MetrouHandler();
        MijlocTransportHandler handlerTramvai = new TramvaiHandler();
        MijlocTransportHandler handlerTroleibuz = new TroleibuzHandler();

        handlerTroleibuz.setUrmatorulMijloc(handleAutobuz);
        handleAutobuz.setUrmatorulMijloc(handlerTramvai);
        handlerTramvai.setUrmatorulMijloc(handlerMetrou);

        handlerTroleibuz.recomandaMijloc(7);
        handlerTroleibuz.recomandaMijloc(1);
        handlerTroleibuz.recomandaMijloc(4);
        handlerTroleibuz.recomandaMijloc(12);
    }
}