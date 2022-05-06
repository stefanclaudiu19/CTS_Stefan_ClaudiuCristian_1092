package clase;

public class MetrouHandler extends MijlocTransportHandler {
    @Override
    public void recomandaMijloc(int distanta) {
        System.out.println("Se recomanda metroul pentru distanta " + distanta);
    }
}