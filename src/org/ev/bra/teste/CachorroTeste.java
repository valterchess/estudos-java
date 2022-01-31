package org.ev.bra.teste;

import org.ev.bra.modelos.Cachorro;

public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro beagle = new Cachorro();
        beagle.setRaca("Beagle");
        beagle.setTamanho(40);
        beagle.latir();
    }
}
