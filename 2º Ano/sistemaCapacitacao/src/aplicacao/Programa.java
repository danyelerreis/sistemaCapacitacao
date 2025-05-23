package aplicacao;

import entidades.ServidorPublico;

import java.sql.SQLOutput;

public class Programa {
    public static void main (String[]args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasília");
        isabela.setEmail("isabela@gmail.");

        System.out.println("Servidor : " + isabela.getNome());
    }
}
