package entidades;

import javax.swing.*;

public class Conta {
    private String titular;
    private Integer numero;
    private double saldo;

    public Conta(){
    }
    public Conta(String titular, Integer numero, Double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    public Conta(String titular, Integer numero) {
        this.titular = titular;
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor){
        if (valor > saldo){
            return false;
        }else{
            saldo -=valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!!!"+"\nSeu novo saldo: "+getSaldo());
            return true;
        }
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(Conta conta, double valor){
       boolean saque;
       saque = sacar(valor);
        if(!saque){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!!"+"\nSeu saldo é: "+getSaldo());
        }else{
            conta.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
