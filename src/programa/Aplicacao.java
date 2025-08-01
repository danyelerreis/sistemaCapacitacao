package programa;

import entidades.Conta;

import javax.swing.*;

public class Aplicacao {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Informe o nome do titular");
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta"));
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar um depósito?");
        Conta conta;
        if(resposta == 0) {
            Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser depositado!"));
       conta = new Conta(nome, numero, valor);
        }else{
          conta = new Conta(nome, numero);
        }
        JOptionPane.showMessageDialog(null, "conta"+conta);

        Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do depósito?"));

        conta.depositar(valor);

        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do saque? "));

        conta.sacar(valor);
        JOptionPane.showMessageDialog(null, "conta"+conta);



         nome = JOptionPane.showInputDialog(null, "Informe o nome do titular");
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta"));
        resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar um depósito?");
        Conta conta2;
        if(resposta == 0) {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser depositado!"));
            conta2 = new Conta(nome, numero, valor);
        }else{
            conta2 = new Conta(nome, numero);
        }
        JOptionPane.showMessageDialog(null, "conta"+conta2);

        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da transferência?"));
        conta.transferir(conta2, valor);

        JOptionPane.showMessageDialog(null, conta2);


    }
}
