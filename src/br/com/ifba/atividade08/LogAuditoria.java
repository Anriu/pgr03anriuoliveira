package br.com.ifba.atividade08;

/**
 *
 * @author anriu
 */
public class LogAuditoria {

    //Atributos da classe LogAuditoria
    private String acao;

    //Construtor
    public LogAuditoria(String acao) {
        this.acao = acao;
    }
    
    //ToString customizado
    @Override
    public String toString() {
        return acao;
    }
}
