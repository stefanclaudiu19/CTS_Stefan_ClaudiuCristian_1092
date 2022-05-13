package main;

import clase.Autobuz;
import clase.InCursa;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(336);
        autobuz.pleacaInCursa();
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapatDeLinie();
    }
}
