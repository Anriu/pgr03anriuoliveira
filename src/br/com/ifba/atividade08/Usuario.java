package br.com.ifba.atividade08;

/**
 *
 * @author anriu
 */
public class Usuario {

    //Atributos do usuario
    private Long id;
    private String nome;
    private PerfilUsuario perfil;
    private Sessao sessao;
    private LogAuditoria log;

    
    //construtor do usuario que recebe um long id uma String nome e um PerfilUsuario perfil
    public Usuario(Long id, String nome, PerfilUsuario perfil) {
        this.id = id;
        this.nome = nome;
        this.perfil = perfil;
    }

    
    //getters e stters
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public void setLog(LogAuditoria log) {
        this.log = log;
    }

    //ToString customizado para imprimir o nome do usuario, o perfil, a sessao e o log
    @Override
    public String toString() {
        return "Usuario: " + nome +
               "\n" + perfil +
               "\nSessao: " + sessao +
               "\nLog: " + log;
    }
}