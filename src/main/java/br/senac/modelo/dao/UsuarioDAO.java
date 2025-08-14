package br.senac.modelo.dao;

import br.senac.modelo.entidade.Usuario;

import java.util.List;

public interface UsuarioDAO {

    void inserirUsuario (Usuario usuario);

    void deletarUsuario (Usuario usuario);

    void editarUsuario (Usuario usuario);

    Usuario recuperarUsuario(long id);

    Usuario buscarPorEmailESenha(String email, String senha);

    List<Usuario> recuperarUsuarios();




}