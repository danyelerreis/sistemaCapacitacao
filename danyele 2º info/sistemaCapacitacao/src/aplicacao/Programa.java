package aplicacao;

import entidades.Funcionario;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//        isabela.setSalario(2500);
//
//        System.out.println(isabela.calcularSalarioHorasExtras(5.60, 10 , 10));
//        System.out.println("Servidor: "+ isabela.getNome());
//        System.out.printf("Salário servidor: R$%.2f ",isabela.getHorasExtras());
//
//        ServidorPublico joao = new ServidorPublico();
//        ServidorPublico maria = new ServidorPublico(123,"Maria");
//        System.out.println("Servidor: "+ maria.getNome());
//        ServidorPublico jose= new ServidorPublico(134, "jose", "Professora");
//        System.out.println("Servidor: "+ jose.getNome());
//        Produto produto = new Produto();
//        Scanner leia = new Scanner(System.in);
//
//        System.out.println("Digite as informações do produto:");
//        System.out.print("Nome: ");
//        produto.setNome(leia.next());
//        System.out.print("Preço: ");
//        produto.setPreco(leia.nextDouble());
//        System.out.print("Quantidade em estoque: ");
//        produto.setQuantidade(leia.nextInt());
//
//        int op = 0;
//        while (op != 3) {
//            System.out.println("\n *Informações do produto* ");
//            System.out.println("Nome:" + produto.getNome() + " Preço:R$" + produto.getPreco() + " Quantidade em estoque:" + produto.getQuantidade() + " Valor total no estoque:R$" + produto.calcularValorEstoque());
//            System.out.print("\n *Realizar uma ação no estoque*\n1- Entrada 2- Saída 3-Fechar programa: ");
//            op = leia.nextInt();
//            if (op == 1) {
//                System.out.print("Quantidade de produtos que deseja adicionar: ");
//                int quantidade = leia.nextInt();
//                produto.adicionarProdutos(quantidade);
//            } else if (op == 2) {
//                System.out.print("Quantidade de produtos que deseja remover: ");
//                int quantidade = leia.nextInt();
//                produto.removerProdutos(quantidade);
//            }
//        }
//        System.out.println("Fechando o programa :)");
//        leia.close();

        Funcionario funcionario = new Funcionario();
        Scanner leia = new Scanner(System.in);
        System.out.print("Nome: ");
        funcionario.setNome(leia.next());
        System.out.print("Salário bruto: ");
        funcionario.setSalario(leia.nextDouble());
        System.out.print("Imposto: ");
        funcionario.setImposto(leia.nextDouble());

        System.out.println("\n Dados do Funcionário ");
        System.out.println("Nome:" + funcionario.getNome() + "\n Salario líquido:R$" + funcionario.getSalario());
        System.out.println("Qual a porcentagem de aumento do salário? ");
        double porcentagem = leia.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.println("Dados atualizados: "+funcionario.toString());

    }
}