package main;

import clase.Autobuz;
import clase.Flota;
import clase.Item;

public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota("Companie");
        Autobuz a1 = new Autobuz("Mercedes", "MX123", 10);
        Autobuz a2 = new Autobuz("Otokar", "MX123", 10);
        Autobuz a3 = new Autobuz("Otokar", "MX123", 30);
        Autobuz a4 = new Autobuz("Mercedes", "MX123", 30);
        Autobuz a5 = new Autobuz("Audi", "MX123", 50);
        Autobuz a6 = new Autobuz("Audi", "MX123", 50);

        Flota mici = new Flota("Autobuze mici");
        Flota medii = new Flota("Autobuze medii");
        Flota mari = new Flota("Autobuze mari");

        mici.adaugaItem(a1);
        mici.adaugaItem(a2);
        medii.adaugaItem(a3);
        medii.adaugaItem(a4);
        mari.adaugaItem(a5);
        mari.adaugaItem(a6);

        flota.adaugaItem(mici);
        flota.adaugaItem(medii);
        flota.adaugaItem(mari);

        mici.stergeItem(a2);

        flota.descrieItem();
        System.out.println("Garantie pentru flota mare " + mari.calculeazSumaGarantata(50));

        Item obtinut = mari.getItem(1);
        obtinut.descrieItem();
    }
}