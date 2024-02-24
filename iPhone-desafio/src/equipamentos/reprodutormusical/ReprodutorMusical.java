package equipamentos.reprodutormusical;

public class ReprodutorMusical implements Ipod {
    public void tocar(){
        System.out.println("Tocando Ipod");
    }
    public void pausar(){
        System.out.println("Pausando Ipod");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando Musica no Ipod");
    }

}
