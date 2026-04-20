package br.com.ifba.atividade08;

/**
 *
 * @author anriu
 */
public class Sessao {
    //Atributos da classe Sessao
    private String token;
    
    
    //Construtor da sessao que recebe a String token
    public Sessao(String token) {
        this.token = token;
    }

    //ToString da sessao que retorna o token da sessao
    @Override
    public String toString() {
        return token;
    }
}
