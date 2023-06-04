import models.ConjuntoProdutos;
import models.Fornecedor;
import models.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean menu = true;
        char opc;


        Fornecedor ze = new Fornecedor("1234321", "(81) 98989-9999", "Zé Maria");
        Fornecedor claudio = new Fornecedor("543212345", "(81) 97979-9999", "Cláudio");
        ConjuntoProdutos conjunto = new ConjuntoProdutos();

        do {
            System.out.println("---------------------------------------------------------------\nBem Vindo !!\n\n1 - Novo Produto\n2 - Alterar Produto\n3 - Remover Produto" +
                    "\n4 - Atualizar Preço\n5 - Mostrar Produtos\n6 - Sair\n\n---------------------------------------------------------------");
            System.out.print("Digite o número da função desejada: ");
            int opcao = in.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Fornecedores:\n\n1 - Zé Maria\n2 - Cláudio\n");
                    System.out.print("Digite o número do Fornecedor: ");
                    int escolha = in.nextInt();
                    if(escolha == 1) {

                        System.out.print("Código: ");
                        int codigo = in.nextInt();

                        System.out.print("Nome (Em vez de espaços use _): ");
                        String nome = in.next();

                        System.out.print("Valor: ");
                        double valor = in.nextDouble();

                        Produto produtoZe = new Produto(codigo, nome, valor, ze);
                        conjunto.inserirProduto(produtoZe);
                    } else {

                        System.out.print("Código: ");
                        int codigo = in.nextInt();

                        System.out.print("Nome(Em vez de espaços use _): ");
                        String nome = in.next();

                        System.out.print("Valor: ");
                        double valor = in.nextDouble();

                        Produto produtoZe = new Produto(codigo, nome, valor, claudio);
                        conjunto.inserirProduto(produtoZe);
                    }
                    System.out.println("\nDeseja retornar ao menu? (S/N): ");
                        opc = in.next().charAt(0);

                        if(opc == 'N' || opc == 'n'){
                            System.out.println("Muito obrigado, Volte sempre!!");
                            menu = false;
                        }

                    break;

                case 2:

                    System.out.println("Oque você deseja alterar do produto\n1 - Nome\n2 - Valor\n3 - Todos");
                    System.out.print("Digite a opção: ");
                    conjunto.atualizarProduto(in.nextInt());

                    System.out.println("\nDeseja retornar ao menu? (S/N): ");
                    opc = in.next().charAt(0);

                    if(opc == 'N' || opc == 'n'){
                        menu = false;
                    }
                    break;
                case 3:

                    System.out.print("Digite o código do produto que deseja remover: ");
                    conjunto.removerProduto(in.nextInt());

                    System.out.println("\nDeseja retornar ao menu? (S/N): ");
                    opc = in.next().charAt(0);

                    if(opc == 'N' || opc == 'n'){
                        System.out.println("Muito obrigado, Volte sempre!!");
                        menu = false;
                    }
                    break;
                case 4:

                    System.out.print("Digite o Código do Produto: ");
                    int codigo = in.nextInt();
                    System.out.print("Digite o valor percentual para a atualização: ");
                    float valor = in.nextFloat();

                    conjunto.atualizarPreco(codigo, valor);

                    System.out.println("\nDeseja retornar ao menu? (S/N): ");
                    opc = in.next().charAt(0);

                    if(opc == 'N' || opc == 'n'){
                        System.out.println("Muito obrigado, Volte sempre!!");
                        menu = false;
                    }
                    break;
                case 5:
                    conjunto.mostrarProduto();

                    System.out.println("\nDeseja retornar ao menu? (S/N): ");
                    opc = in.next().charAt(0);

                    if(opc == 'N' || opc == 'n'){
                        menu = false;
                    }
                    break;
                case 6:
                    System.out.println("Muito obrigado, Volte sempre!!");
                    menu = false;

            }



        } while (menu == true);


    }
}