package clase;

public class TroleibuzHandler extends MijlocTransportHandler {
    @Override
    public void recomandaMijloc(int distanta) {
        if (distanta < 3) {
            System.out.println("Se recomanda troleibuzul pentru distanta " + distanta);
        } else {
            super.getUrmatorulMijloc().recomandaMijloc(distanta);
        }
    }
}