package aplicacao;
import entidades.ServidorPublico;

public class Programa {
    public static void main (String[]args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasília");
        isabela.setEmail("isabela@gmail.");
        isabela.setSalario(2500);

        isabela.calcularSalarioHorasExtras(10, 5.60 );
        isabela.calcularNumeros();

        System.out.println("Servidor : " + isabela.getNome());
        System.out.println("Horas extras R$ %.2f: "+isabela.getHorasExtras());

    }
}
