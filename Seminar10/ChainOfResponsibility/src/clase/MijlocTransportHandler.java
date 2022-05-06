package clase;

public abstract class MijlocTransportHandler {
    private MijlocTransportHandler urmatorulMijloc;

    public MijlocTransportHandler getUrmatorulMijloc() {
        return urmatorulMijloc;
    }

    public void setUrmatorulMijloc(MijlocTransportHandler urmatorulMijloc) {
        this.urmatorulMijloc = urmatorulMijloc;
    }

    public abstract void recomandaMijloc(int distanta);
}