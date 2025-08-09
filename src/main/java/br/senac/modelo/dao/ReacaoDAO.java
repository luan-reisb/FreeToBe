package br.senac.modelo.dao;


import br.senac.modelo.entidade.Reacao;

public interface ReacaoDAO {

    void atualizarReacao(Reacao reacao);

    void adicionarReacao(Reacao reacao);

    void deletarReacao(Reacao reacao);

    Reacao recuperarReacao(Reacao reacao);
}
