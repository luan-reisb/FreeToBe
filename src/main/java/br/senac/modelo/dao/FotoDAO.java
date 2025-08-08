package br.senac.modelo.dao;

import br.senac.modelo.entidade.Foto;

public interface FotoDAO {

    void adicionarFoto(Foto foto);

    void deletarFoto(Foto foto);

    void atualizarFoto(Foto foto);

    Foto recuperarFoto(Foto foto);
}
