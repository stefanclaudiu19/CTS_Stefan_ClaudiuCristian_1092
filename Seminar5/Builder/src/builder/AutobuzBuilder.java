package builder;

public class AutobuzBuilder implements Builder {
    private Autobuz autobuz;

    public AutobuzBuilder() {
        this.autobuz = new Autobuz();
    }

    public AutobuzBuilder setModel(String model) {
        autobuz.setModel(model);
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setOprireCapat(boolean oprireCapat) {
        autobuz.setOprireCapat(oprireCapat);
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        autobuz.setDeschideUsi(deschideUsi);
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        autobuz.setTextDerulat(textDerulat);
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        autobuz.setNrInmatriculare(nrInmatriculare);
        return this;
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }
}
