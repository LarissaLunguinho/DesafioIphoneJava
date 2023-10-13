package usuario;

import equipamentos.aparelhotelefonico.AparelhoTelefonico;
import equipamentos.multifuncional.EquipamentoMultifuncional;
import equipamentos.navegadorinternet.Navegador;
import equipamentos.reprodutormusical.Musicas;

public class Usuario {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Navegador navegador = em;
        AparelhoTelefonico aparelhoTelefonico = em;
        Musicas musicas = em;

        navegador.navegador();
        aparelhoTelefonico.aparelhotelefonico();
        musicas.musicas();
    }
}
