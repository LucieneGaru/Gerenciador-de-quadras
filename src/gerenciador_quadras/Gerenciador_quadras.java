package gerenciador_quadras;

import javax.swing.JOptionPane;

public class Gerenciador_quadras {

    public static void main(String[] args) {
        StringBuilder mensagemSaudacao = new StringBuilder();
        mensagemSaudacao.append(" Bem vindo ao Gerenciador de Quadras! ").append("\n");
        JOptionPane.showMessageDialog(null, mensagemSaudacao);
        
        StringBuilder mensagemLocatario = new StringBuilder();
        mensagemLocatario.append("Primeiro vamos cadastrar os dados do Locatário:").append("\n");
        JOptionPane.showMessageDialog(null, mensagemLocatario);
        Locacao novaLocacao = new Locacao();

       novaLocacao.cadastroLocacao();
    }
}
