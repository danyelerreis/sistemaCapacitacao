package entidades;

public class Funcionario {
   private String nome;
    private double salarioBruto;
    private double imposto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salarioBruto;
    }

    public void setSalario(double salario) {
        this.salarioBruto = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
   public double calcularSalarioLiquido(){
        double salarioLiquido;
        salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
    }
   public void aumentarSalario( double porcentagem){
        double aumento = salarioBruto *(porcentagem/100);
        salarioBruto+= aumento;
        calcularSalarioLiquido();
   }
   public String toString(){
        return nome
            + " ,R$ "
               +String.format("%.2f", calcularSalarioLiquido()) ;
    }
}
