package br.com.ifba.atividade08;

/**
 *
 * @author anriu
 */
public class PerfilUsuario {

    
    //Atributos de PerfilUsuario
    private Long id;
    private String descricao;

    
    //Construtor de Perfil usuario que apenas recebe o id e a descrição do tipo de usuario
    public PerfilUsuario(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Perfil: " + descricao;
    }
}
