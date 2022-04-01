//  3. Pentru obiectele de tipul AutobuzLinie se doreste ca
//  in momentul in care au fost create obiectele de acest tip sa nu mai poata fi modificate.
//  De asemenea pentru crearea unui obiect de tipul AutobuzLinie trebuie precizat modelul de autobuz folosit,
//  soferul care il va conduce, daca va avea opriri la capat de linie,
//  daca deschide usile in fiecare statie fara ca pasagerii sa solicite acest lucru,
//  textul afisat de ecranul derulator si alte elemente.
//  Unele atribute sunt optionale avand o valoare prestabilita.
//  Se doreste implementarea modulului care se va ocupa de initializarea acestor obiecte,
//  nefiind necesara introducerea atributelor optionale, iar obiectul odata creat sa nu mai poata fi modificat.

package main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new AutobuzBuilder().setModel("Ford").setNumeSofer("Vasile").build();
        Autobuz autobuz2 = new AutobuzBuilder().setNrInmatriculare("B-123-STB").build();
        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}
