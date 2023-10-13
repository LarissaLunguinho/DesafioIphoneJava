package equipamentos.multifuncional;

import equipamentos.aparelhotelefonico.AparelhoTelefonico;
import equipamentos.navegadorinternet.Navegador;
import equipamentos.reprodutormusical.Musicas;

public class EquipamentoMultifuncional implements AparelhoTelefonico, Navegador, Musicas {

    public void musicas() {
        System.out.println("REPRODUZINDO MUSICA PELO EQUIP. MULTI.");
    }

    public void navegador() {
        System.out.println("NAVEGANDO PELO EQUIP. MULTI.");        
    }

    public void aparelhotelefonico() {
        System.out.println("APARELHO TELEFONICO MUSICA PELO EQUIP. MULTI.");        
    }
}
