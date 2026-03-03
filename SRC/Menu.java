import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void exibir() {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("""
                1 - Buscar livro pelo título
                2 - Listar livros registrados
                3 - Listar autores registrados
                4 - Listar autores vivos em determinado ano
                5 - Listar livros por idioma
                0 - Sair
            """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> buscarLivro();
                case 2 -> listarLivros();
                case 3 -> listarAutores();
                case 4 -> listarAutoresVivos();
                case 5 -> listarPorIdioma();
            }
        }
    }
}