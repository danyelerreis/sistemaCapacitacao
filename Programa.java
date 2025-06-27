package aplicacao;

import entidades.Curso;
import entidades.Funcionario;
import entidades.ServidorPublico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

        //Lista de Servidores
        List<ServidorPublico> servidores = new ArrayList<>();
        //Lista de Cursos
        List<Curso> cursos = new ArrayList<>();


        public void adicionarServidorPublico(){
            int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Matrícula do Servidor: "));
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do Servidor: ");
            String orgao = JOptionPane.showInputDialog(null, "Informe o órgão: ");
            String cargo = JOptionPane.showInputDialog(null, "Informe o cargo do Servidor: ");
            String lotacao = JOptionPane.showInputDialog(null, "Informe a lotacao do Servidor: ");
            String email = JOptionPane.showInputDialog(null, "Informe o email do Servidor: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario do Servidor: "));

            ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, salario, cargo,lotacao,email);

            servidores.add(servidor);

        }
        /**
         * Metodo que adiciona na lista de servidores os servidor instanciado
         */
        public void listarServidoresPublicos(){
            for (ServidorPublico servidor : servidores) {
                System.out.println(servidor);
            }
        };
       public void listarServidorPublico(int matricula){
           boolean encontrou = false;
           for (ServidorPublico servidor : servidores) {
               if (servidor.getMatricula() == matricula){
                   System.out.println(servidor);
                   encontrou = true;
                   break;
               }
           }
           if (!encontrou){
               JOptionPane.showInputDialog(null, "Servidor não encontrado!!!");
           }
        }
    public void listarServidorPublico(String nome){
        boolean encontrou = false;
        for (ServidorPublico servidor : servidores) {
            if(servidor.getNome().equalsIgnoreCase(nome)) {
                System.out.println(servidor);
                encontrou = true;
                break;
            }
            if (!encontrou){
                JOptionPane.showInputDialog(null, "Servidor não encontrado!!!");
            }
        }
            }
//        alterarServidorPublico(ServidorPublico servidor)
//        excluirServidorPublico(int matricula);
//        calcularFolhaServidoresPublicos

      public static void main(String[] args) {
         Programa programa = new Programa();
         programa.adicionarServidorPublico();
         programa.listarServidoresPublicos();

     programa.listarServidorPublico(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));

     programa.listarServidorPublico(JOptionPane.showInputDialog(null, "Informe o nome que deseja pesquisar"));
      }
}