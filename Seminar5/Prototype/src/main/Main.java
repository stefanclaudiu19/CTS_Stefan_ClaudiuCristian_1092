//  2. Pentru crearea de obiecte de tip Autobuz sunt consumate foarte multe resurse.
//  Din acest motiv trebuie propusa o varianta prin care daca exista deja un obiect creat,
//  sa fie folosit acest obiect pentru viitoarele obiecte,
//  fara a mai fi nevoie de crearea de la 0 a obiectelor de tip Autobuz.
//  Aceeasi regula se va aplica si pentru alte tipuri de mijloace de transport.

package main;

import clase.Autobuz;
import clase.Tramvai;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("Andrei");
        MijlocTransport tramvai = new Tramvai("George");
        Autobuz autobuz2;
        Tramvai tramvai2;

        try {
            autobuz2 = (Autobuz) autobuz.copiaza();
            autobuz2.setSoferAutobuz("Matei");
            tramvai2 = (Tramvai) tramvai.copiaza();
            tramvai2.setVatmanTramvai("Ion");

            System.out.println(autobuz);
            System.out.println(autobuz2);
            System.out.println(tramvai);
            System.out.println(tramvai2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
