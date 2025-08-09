package br.senac.modelo.entidade;

import br.senac.modelo.entidade.TipoReacao;
import br.senac.modelo.entidade.Usuario;

public class Reacao {
    private Long id;
    private TipoReacao tipoReacao;
    private Usuario usuario;
    //private Avaliacao avaliacao;
    //private Depoimento depoimento;


    public Reacao(Long id, TipoReacao tipoReacao, Usuario usuario) {
        setId(id);
        setTipoReacao(tipoReacao);
        setUsuario(usuario);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoReacao getTipoReacao() {
        return tipoReacao;
    }

    public void setTipoReacao(TipoReacao tipoReacao) {
        this.tipoReacao = tipoReacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public static TipoReacao aplicarReacao(TipoReacao tipoReacao){
        return tipoReacao;
    }
}
