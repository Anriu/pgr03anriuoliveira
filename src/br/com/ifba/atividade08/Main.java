package br.com.ifba.atividade08;

/**
 *
 * @author anriu
 */

public class Main {
    public static void main(String[] args) {

        
        //Classe main apenas para testes
        PerfilUsuario perfil = new PerfilUsuario(1L, "Admin");

        Usuario user = new Usuario(1L, "Anriu", perfil);

        Sessao sessao = new Sessao("ABC123");
        LogAuditoria log = new LogAuditoria("Login realizado");

        user.setSessao(sessao);
        user.setLog(log);

        System.out.println(user);
    }
}
