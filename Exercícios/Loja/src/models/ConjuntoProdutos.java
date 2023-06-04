package models;

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntoProdutos  {
    private ArrayList<Produto> listaProdutos;


    public ConjuntoProdutos(){
        listaProdutos = new ArrayList<>();
    }

    public void inserirProduto(Produto produto) {
        for (Produto p : listaProdutos) {
            if(p.getCod() == produto.getCod()) {
                System.out.println("Produto já Existente");
                return ;
            }
        }
        listaProdutos.add(produto);
        System.out.println("Produto Inserido com Sucesso");
    }

    public void removerProduto (int codigo) {
        for (Produto produto: listaProdutos) {
            if(produto.getCod() == codigo) {
                listaProdutos.remove(produto);
                System.out.println("Produto removido com Sucesso");
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }

    public void atualizarPreco (int codigo, float porcentagem) {
        for (Produto produto: listaProdutos) {
            if(produto.getCod() == codigo) {
                produto.atualizarPreco(porcentagem);
            } else {
                System.out.println("Produto não encontrado");
            }

        }
    }

    public void atualizarProduto (int opcao) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o código do Produto: ");
        int cod = in.nextInt();
        for (Produto p: listaProdutos) {

            if (p.getCod() == cod) {

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o novo nome (Em vez de espaços use _): ");
                        p.setNome(in.next());
                        System.out.println("Nome alterado com sucesso");
                        break;
                    case 2:
                        System.out.print("Digite o novo Valor: ");
                        p.setValor(in.nextDouble());
                        System.out.println("Valor alterado com sucesso");
                        break;
                    case 3:
                        System.out.print("Digite o novo nome (Em vez de espaços use _): ");
                        p.setNome(in.next());
                        System.out.print("Digite o novo Valor: ");
                        p.setValor(in.nextDouble());
                        System.out.println("Produto atualizado com sucesso");
                        break;
                }
                return;

            }
        }
    }

    public void mostrarProduto (){
        for (Produto p:listaProdutos) {
            System.out.println("\nCódigo: " + p.getCod() + "\nNome: " + p.getNome() + "\nValor: R$" + p.getValor() + "\nFornecedor: " + p.fornecedor.getNome());
        }

    }

}

