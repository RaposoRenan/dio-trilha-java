package equipamentos.iPhone;

import equipamentos.aparelho.AparelhoTelefonico;
import equipamentos.computador.Computador;
import equipamentos.reprodutormusical.Ipod;

public class Iphone implements AparelhoTelefonico, Computador, Ipod {

    public void ligar() {
        System.out.println("Ligando iPhone");
    }

    public void atender() {
        System.out.println("Atendendo iPhone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina no iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba no iPhone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar pagina no iPhone");
    }

    public void tocar() {
        System.out.println("Tocar musica no iPhone");
    }

    public void pausar() {
        System.out.println("Pausar musica no iPhone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar musica no iPhone");
    }
}
