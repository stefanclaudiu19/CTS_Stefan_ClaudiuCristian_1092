package clase;

public class TramvaiHandler extends MijlocTransportHandler {
    @Override
    public void recomandaMijloc(int distanta) {
        if (distanta < 10) {
            System.out.println("Se recomanda tramvaiul pentru distanta " + distanta);
        } else {
            super.getUrmatorulMijloc().recomandaMijloc(distanta);
        }
    }
}