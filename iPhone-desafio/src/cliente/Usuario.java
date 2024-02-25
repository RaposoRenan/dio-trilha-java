package cliente;


import equipamentos.aparelho.Celular;
import equipamentos.iPhone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        Celular cel = new Celular();

        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        iPhone.pausar();
        iPhone.selecionarMusica();
        iPhone.tocar();

        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        cel.ligar();

    }
}
