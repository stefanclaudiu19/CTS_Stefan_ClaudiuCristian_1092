package clase;

public class AutobuzHandler extends MijlocTransportHandler {
    @Override
    public void recomandaMijloc(int distanta) {
        if (distanta < 5) {
            System.out.println("Se recomanda autobuzul pentru distanta " + distanta);
        } else {
            super.getUrmatorulMijloc().recomandaMijloc(distanta);
        }
    }
}