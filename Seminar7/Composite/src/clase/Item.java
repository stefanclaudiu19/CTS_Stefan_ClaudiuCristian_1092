package clase;

public interface Item {
    void descrieItem();

    void adaugaItem(Item item) throws Exception;

    void stergeItem(Item item) throws Exception;

    Item getItem(int position) throws Exception;

    float calculeazSumaGarantata(float pretPerLoc);
}