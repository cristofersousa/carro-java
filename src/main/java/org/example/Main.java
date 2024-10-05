package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarroCrud carroCRUD = new CarroCrud();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Listar Carros");
            System.out.println("3. Atualizar Carro");
            System.out.println("4. Deletar Carro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite a marca do carro: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o ano do carro: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha

                    Carro carro = new Carro(modelo, marca, ano);
                    carroCRUD.criarCarro(carro);
                    break;

                case 2:
                    carroCRUD.listarCarros();
                    break;

                case 3:
                    System.out.print("Digite o índice do carro para atualizar: ");
                    int indiceAtualizar = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha
                    System.out.print("Digite o novo modelo: ");
                    String novoModelo = scanner.nextLine();
                    System.out.print("Digite a nova marca: ");
                    String novaMarca = scanner.nextLine();
                    System.out.print("Digite o novo ano: ");
                    int novoAno = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha

                    carroCRUD.atualizarCarro(indiceAtualizar - 1, novoModelo, novaMarca, novoAno);
                    break;

                case 4:
                    System.out.print("Digite o índice do carro para deletar: ");
                    int indiceDeletar = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha

                    carroCRUD.deletarCarro(indiceDeletar - 1);
                    break;

                case 5:
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}