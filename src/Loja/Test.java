package Loja;

public class Test {
  Produto produto;

  public void criarProduto(int codigo, String nome, double preco, String cor, String tamanho, String tipo) {

    this.produto = new Produto(codigo,nome,preco,cor,tamanho,tipo);


    System.out.println("Produto criado com sucesso");

  }

  public void exibirProdutos() {

      if (produto == null) {
        System.out.println("Nenhum produto disponível.");
        return;
      }

      System.out.println("Produto cadastrado:");
      System.out.println("Código: " + produto.codigo);
      System.out.println("Nome: " + produto.nome);
      System.out.println("Preço: R$" + produto.preco);
      System.out.println("Cor: " + produto.cor);
      System.out.println("Tamanho: " + produto.tamanho);
      System.out.println("Tipo: " + produto.tipo);
    System.out.println("");
    }



  public void exibirMenu() {
    System.out.println("Menu:");
    System.out.println("1. Novo Produto");
    System.out.println("2. Exibir Produto");
    System.out.println("3. Sair");
    System.out.print("Escolha uma opção: ");
  }

  public void encerrarMenu() {
    System.out.println("Encerrando o programa");
  }






}