package br.senac.modelo.entidade;

public class Conquista {
    private Long id;
    private String nomeConquista;
    private String descricaoConquista;
    private int pontos;
    //private Foto iconeConquista;

    public Conquista() {

    }

    public Conquista(Long id, String nomeConquista, String descricaoConquista) {
        setId(id);
        setNomeConquista(nomeConquista);
        setDescricaoConquista(descricaoConquista);
    }

	/*public ConquistaDesbloqueada() {}

	public ConquistaDesbloqueada(Long id, String nomeConquista, String descricaoConquista, Foto iconeConquista) {
		setId(id);
		setNomeConquista(nomeConquista);
		setDescricaoConquista(descricaoConquista);
		setIconeConquista(iconeConquista);
	}
	*/


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeConquista() {
        return nomeConquista;
    }
    public void setNomeConquista(String nomeConquista) {
        this.nomeConquista = nomeConquista;
    }
    public String getDescricaoConquista() {
        return descricaoConquista;
    }
    public void setDescricaoConquista(String descricaoConquista) {
        this.descricaoConquista = descricaoConquista;
    }

	/*public Foto getIconeConquista() {
		return iconeConquista;
	}

	public void setFoto(Foto iconeConquista) {
		this.foto = iconeConquista;
	}
	*/

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
