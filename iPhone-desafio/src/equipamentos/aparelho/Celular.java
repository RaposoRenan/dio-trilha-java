package equipamentos.aparelho;

public class Celular implements AparelhoTelefonico {

    public void ligar() {
        System.out.println("Ligando o Celular");
    }

    public void atender() {
        System.out.println("Atendendo o Celular");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Corrêio de Voz no Celular");
    }
}
