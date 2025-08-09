package br.senac.modelo.entidade;

public enum TipoReacao {
    CURTIDA ("Curtida"),
    DESCURTIDA ("Descurtida");


    public final String tipoReacao;


    TipoReacao(String tipoReacao) {
        this.tipoReacao = tipoReacao;
    }

    public String getTipoReacao() {
        return tipoReacao;
    }
}
