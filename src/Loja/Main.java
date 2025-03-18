package Loja;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    Scanner scanner = new Scanner(System.in);
    Test teste = new Test();

    boolean running = true;

    while (running) {
      teste.exibirMenu();
      
      int opcao = scanner.nextInt();
      scanner.nextLine(); 

      switch (opcao) {
        case 1:
          System.out.println("Digite o codigo do produto");
          int codigo = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Digite o nome do produto: ");

          String nome = scanner.nextLine();
          System.out.println("Digite o preço do produto");
          double preco = scanner.nextDouble();
          scanner.nextLine();
          System.out.println("Digite a cor do produto");
          String cor = scanner.nextLine();
          System.out.println("Digite o tamanho do produto");
          String tamanho = scanner.nextLine();
          System.out.println("Digite o tipo do produto");
          String tipo = scanner.nextLine();

          teste.criarProduto(codigo,nome,preco,cor,tamanho,tipo);



          break;
        case 2:
         teste.exibirProdutos();
          break;
        case 3:
          running = false;
          teste.encerrarMenu();
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          System.out.println("\n");
      }
    }
    scanner.close();
  }
}