package gerenciador_quadras;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Quadra {
    private String nome;
    private String tipoDaQuadra;
    private double valorMinuto;
    
    public void cadastroQuadra(){
        
        this.nome = JOptionPane.showInputDialog("Informe o nome da quadra: ");
        this.tipoDaQuadra = JOptionPane.showInputDialog("Agora informe o tipo de quadra: ");
        this.valorMinuto = Integer.parseInt(JOptionPane.showInputDialog("Informe também o valor de locação por minuto: "));
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaQuadra() {
        return tipoDaQuadra;
    }

    public void setTipoDaQuadra(String tipoDaQuadra) {
        this.tipoDaQuadra = tipoDaQuadra;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }
}
