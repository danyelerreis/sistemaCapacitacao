package aplicacao;
import entidades.ServidorPublico;
import javax.swing.*;

public class Programa {
      public static void main(String[] args) {
          ServidorPublico servidorPublico = new ServidorPublico();
          servidorPublico.adicionarServidorPublico();
          servidorPublico.listarServidoresPublicos();

     servidorPublico.listarServidorPublico(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));
     servidorPublico.listarServidorPublico(JOptionPane.showInputDialog(null, "Informe o nome que deseja pesquisar"));
     servidorPublico.excluirServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula a ser excluída")));
      }
}