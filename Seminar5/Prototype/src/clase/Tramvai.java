package clase;

import prototype.MijlocTransport;

public class Tramvai implements MijlocTransport {
    private String vatmanTramvai;

    public Tramvai(String vatmanTramvai) {
        this.vatmanTramvai = vatmanTramvai;
    }

    public String getVatmanTramvai() {
        return vatmanTramvai;
    }

    public void setVatmanTramvai(String vatmanTramvai) {
        this.vatmanTramvai = vatmanTramvai;
    }

    @Override
    public String toString() {
        return "Tramvai{" +
                "vatmanTramvai='" + vatmanTramvai + '\'' +
                '}';
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }
}
