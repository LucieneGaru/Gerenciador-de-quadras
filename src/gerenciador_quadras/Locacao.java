package gerenciador_quadras;


import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Locacao {
    private Locatario Locatario = new Locatario();
    private Quadra Quadra = new Quadra();
    private int tempoMinuto;
    private char necessitaEquipamento;
    
    public double precoFinal(){

        double precoNormal;
        double precoDesconto;
        double precoEquipamento;

        precoNormal = tempoMinuto * Quadra.getValorMinuto();

        if (tempoMinuto >= 120) {
            precoDesconto = precoNormal * 0.1;
        } else { precoDesconto = 0.0;
        }
        
        if(necessitaEquipamento == 'S' || necessitaEquipamento == 's') {
            precoEquipamento =+ 50.0;
        } else { precoEquipamento = 0.0;
        }

        return precoNormal - precoDesconto + precoEquipamento;
    }
    
    public void mostrarResumoLocacao(){

        StringBuilder mensagemResumo = new StringBuilder();
        mensagemResumo.append("     Resumo da Locação:      ").append("\n \n");
        mensagemResumo.append("Nome do Locatário: ").append(Locatario.getNome()).append("\n");
        mensagemResumo.append("CPF: ").append(Locatario.getCpf()).append("\n");
        mensagemResumo.append("Telefone: ").append(Locatario.getTelefone()).append("\n");
        mensagemResumo.append("Ano de Nascimento: ").append(Locatario.getAnoNascimento()).append("\n");
        mensagemResumo.append("Nome da Quadra Locada: ").append(Quadra.getNome()).append("\n");
        mensagemResumo.append("Tempo de Locação em Minutos: ").append(this.tempoMinuto).append("\n");
        mensagemResumo.append("Necessita Equipamentos: ").append(this.necessitaEquipamento).append("\n");
        mensagemResumo.append("Valor da Locação: R$ ").append(precoFinal()).append("\n");
        JOptionPane.showMessageDialog(null, mensagemResumo);
    }
    
     public void cadastroLocacao(){


        Locatario.cadastroLocatario();


        if(Locatario.verificarMaioridade()== true){
            
        StringBuilder mensagemQuadra = new StringBuilder();
        mensagemQuadra.append("Agora vamos cadastrar os dados da Quadra:").append("\n");
        JOptionPane.showMessageDialog(null, mensagemQuadra);
        
            Quadra.cadastroQuadra();
            
            StringBuilder mensagemLocacao = new StringBuilder();
            mensagemLocacao.append("Tudo certo! Agora vamos cadastrar os dados da Locação:").append("\n");
            JOptionPane.showMessageDialog(null, mensagemLocacao);
            tempoMinuto = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de Locação da quadra em minutos: "));

            necessitaEquipamento = JOptionPane.showInputDialog("O Locatário vai precisar de Equipamentos? Digite S para sim ou N para não: ").charAt(0);

            mostrarResumoLocacao();
        }else{
            JOptionPane.showMessageDialog(null, "Que pena! Identifiquei que o Locatário é menor de idade, e infelizmente a locação não será possível.");
        }
     }
}

