package gerenciador_quadras;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Locatario {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;
    
    public boolean verificarMaioridade(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR); 
        return (anoAtual - anoNascimento) >= 18;
    }
    
    public void cadastroLocatario(){  
        
        this.nome = JOptionPane.showInputDialog("Informe o nome do Locatário:");
        this.cpf = JOptionPane.showInputDialog("Agora informe o CPF: ");
        this.telefone = JOptionPane.showInputDialog("Informe também o telefone para contato:");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("E também o Ano de Nascimento, apenas o ANO, combinado? "));  
        

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
}
