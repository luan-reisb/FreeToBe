package br.senac.modelo.entidade;


import br.senac.modelo.entidade.ConquistaUsuario;

public class Usuario {
    private Long id;
    private String nome;
    private String sobrenome;
    private String pronome;
    private String email;
    private String apelido;
    private String senha;
    private Foto foto;
    private int pontosUsuario;
    public ConquistaUsuario[] conquistas;
    private Estabelecimento[] estabelecimentosCadastrados;
   /* private ConquistaDesbloqueada[] conquistaDesbloqueada;*/
    private Estabelecimento[] estabelecimentosFavoritos;

    public Usuario(){

    }

    public Usuario (int pontosUsuario){
        setPontosUsuario(pontosUsuario);
    }

    public Usuario(ConquistaUsuario[] conquistas) {
       setConquistas(conquistas);
    }



    public Usuario(Long id, String nome, String sobrenome, String email, String apelido, String senha) {
        setId(id);
        setNome(nome);
        setSobrenome(sobrenome);
        setEmail(email);
        setApelido(apelido);
        setSenha(senha);
    }

    /*public Usuario(Long id, String nome, String sobrenome, String pronome, String email, String apelido, String senha, Foto foto, int pontosUsuario, Estabelecimento[] estabelecimentosCadastrados, ConquistaDesbloqueada[] conquistaDesbloqueada, Estabelecimento[] estabelecimentosFavoritos) {
        setId(id);
        setNome(nome);
        setSobrenome(sobrenome);
        setPronome(pronome);
        setEmail(email);
        setApelido(apelido);
        setSenha(senha);
        setFoto(foto);
        setPontosUsuario(pontosUsuario);
        setEstabelecimentosCadastrados(estabelecimentosCadastrados);
        setConquistaDesbloqueada(conquistaDesbloqueada);
        setEstabelecimentosFavoritos(estabelecimentosFavoritos);
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getPronome() {
        return pronome;
    }

    public void setPronome(String pronome) {
        this.pronome = pronome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public int getPontosUsuario() {
        return pontosUsuario;
    }

    public void setPontosUsuario(int pontosUsuario) {
        pontosUsuario = pontosUsuario;
    }

    public Estabelecimento[] getEstabelecimentosCadastrados() {
        return estabelecimentosCadastrados;
    }

    public void setEstabelecimentosCadastrados(Estabelecimento[] estabelecimentosCadastrados) {
        this.estabelecimentosCadastrados = estabelecimentosCadastrados;
    }

   /* public ConquistaDesbloqueada[] getConquistaDesbloqueada() {
        return conquistaDesbloqueada;
    }

    public void setConquistaDesbloqueada(ConquistaDesbloqueada[] conquistaDesbloqueada) {
        this.conquistaDesbloqueada = conquistaDesbloqueada;
    }*/

    public Estabelecimento[] getEstabelecimentosFavoritos() {
        return estabelecimentosFavoritos;
    }

    public void setEstabelecimentosFavoritos(Estabelecimento[] estabelecimentosFavoritos) {
        this.estabelecimentosFavoritos = estabelecimentosFavoritos;
    }


    public void setConquistas(ConquistaUsuario[] conquistas) {
        this.conquistas = conquistas;
    }

    public ConquistaUsuario[] getConquistas() {
        return conquistas;
    }

    public void pontosUsuario(int pontos) {
        this.pontosUsuario += pontos;
    }


    public boolean possuiConquista(ConquistaUsuario conquista) {

    }

    public void conquistaUsuario(ConquistaUsuario[] conquistas){

    }
}

