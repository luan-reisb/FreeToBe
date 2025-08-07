package br.senac.modelo.entidade;

public class Foto {
    private Long id;
    private String nomeArquivo;
    private byte[] coteudoFoto;

    public Foto(Long id, String nomeArquivo, byte[] conteudoFoto){
        setId(id);
        setNomeArquivo(nomeArquivo);
        setCoteudoFoto(conteudoFoto);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public byte[] getCoteudoFoto() {
        return coteudoFoto;
    }

    public void setCoteudoFoto(byte[] coteudoFoto) {
        this.coteudoFoto = coteudoFoto;
    }
}
