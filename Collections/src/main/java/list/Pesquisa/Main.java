package main.java.list.Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor1", 2020);
        catalogoLivros.adicionarLivro("Livro1", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Livro2", "Autor2", 2022);
        catalogoLivros.adicionarLivro("Livro3", "Autor3", 2023);
        catalogoLivros.adicionarLivro("Livro4", "Autor4", 1994);

        System.out.println(catalogoLivros.pesquisaPorAutor("autor2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisaPorTitulo("livro1"));
    }
}
