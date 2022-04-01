package main;

// 1. Companie de transport in comun - STB.
//  Trebuie implementat un modul care sa creeze obiecte de tipul MijlocTransport: Autobuz, Tramvai, Troleibuz
//  Modulul trebuie sa ajute la crearea de obiecte de familia de clase MijlocTransport
//  Tipurile de transport sunt salvate intr-un enum{Autobuz, Tramvai, Troleibuz}.

//  2. Pentru crearea de obiecte de tip Autobuz sunt consumate foarte multe resurse.
//  Din acest motiv trebuie propusa o varianta prin care daca exista deja un obiect creat,
//  sa fie folosit acest obiect pentru viitoarele obiecte,
//  fara a mai fi nevoie de crearea de la 0 a obiectelor de tip Autobuz.
//  Aceeasi regula se va aplica si pentru alte tipuri de mijloace de transport.

//  3. Pentru obiectele de tipul AutobuzLinie se doreste ca
//  in momentul in care au fost create obiectele de acest tip sa nu mai poata fi modificate.
//  De asemenea pentru crearea unui obiect de tipul AutobuzLinie trebuie precizat modelul de autobuz folosit,
//  soferul care il va conduce, daca va avea opriri la capat de linie,
//  daca deschide usile in fiecare statie fara ca pasagerii sa solicite acest lucru,
//  textul afisat de ecranul derulator si alte elemente.
//  Unele atribute sunt optionale avand o valoare prestabilita.
//  Se doreste implementarea modulului care se va ocupa de initializarea acestor obiecte,
//  nefiind necesara introducerea atributelor optionale, iar obiectul odata creat sa nu mai poata fi modificat.

import clase.MijlocTransport;
import clase.TipMijlocTransport;
import factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        MijlocTransport autobuz = factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "B-123-STB");
        MijlocTransport tramvai = factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "B-456-STB");
        MijlocTransport troleibuz = factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "B-789-STB");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
    }
}
