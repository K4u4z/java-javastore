import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    Scanner scanner = new Scanner(System.in);
    Produto produto = null;
    boolean running = true;

    while (running) {
      System.out.println("Menu:");
      System.out.println("1. Novo Produto");
      System.out.println("2. Exibir Produto");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");
      
      int opcao = scanner.nextInt();
      scanner.nextLine(); 

      switch (opcao) {
        case 1:
          System.out.print("Digite o nome do produto: ");
          String nome = scanner.nextLine();
          produto = new Produto(nome);
          System.out.println("Produto criado com sucesso!");
          System.out.println("\n");
          break;
        case 2:
          if (produto != null) {
            System.out.println("Produto: " + produto.nome);
            running = false;
          } else {
            System.out.println("Nenhum produto criado.");
          }
          System.out.println("\n");
          break;
        case 3:
          running = false;
          System.out.println("Saindo do programa...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          System.out.println("\n");
      }
    }
    scanner.close();
  }
}