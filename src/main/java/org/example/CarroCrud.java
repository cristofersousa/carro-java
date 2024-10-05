package org.example;
import java.util.ArrayList;
import java.util.List;

public class CarroCrud {

    // Lista para armazenar os carros
    private List<Carro> carros = new ArrayList<>();

    // Criar (adicionar um carro)
    public void criarCarro(Carro carro) {
        carros.add(carro);
        System.out.println("Carro adicionado com sucesso!");
    }

    // Ler (listar todos os carros)
    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            System.out.println("Lista de Carros:");
            for (int i = 0; i < carros.size(); i++) {
                System.out.print((i + 1) + ". ");
                carros.get(i).exibirInfo();
            }
        }
    }

    // Atualizar (modificar um carro pelo índice)
    public void atualizarCarro(int indice, String novoModelo, String novaMarca, int novoAno) {
        if (indice >= 0 && indice < carros.size()) {
            Carro carro = carros.get(indice);
            carro.setModelo(novoModelo);
            carro.setMarca(novaMarca);
            carro.setAno(novoAno);
            System.out.println("Carro atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Deletar (remover um carro pelo índice)
    public void deletarCarro(int indice) {
        if (indice >= 0 && indice < carros.size()) {
            carros.remove(indice);
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
