package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
       contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 111111111);
        agendaContatos.adicionarContato("Camila", 222222222);
        agendaContatos.adicionarContato("Camila Cavalcante", 333333333);
        agendaContatos.adicionarContato("Camila Dio", 444444444);
        agendaContatos.adicionarContato("Maria Silva", 555555555);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarNome("Camila"));

        System.out.println("Contato Aulualizado " + agendaContatos.atualizarNumeroContato("Maria Silva", 66666666));

        agendaContatos.exibirContatos();
    }
}
