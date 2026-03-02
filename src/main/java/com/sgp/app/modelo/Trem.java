package com.sgp.app.modelo;

public class Trem {
    private String nome;
    public String cor;
    private int anoProducao;
    private int lotacaoMaxima;

    public Trem( String nome, String cor, int anoProducao, int lotacaoMaxima) {
        this.nome = nome;
        this.cor = cor;
        this.anoProducao = anoProducao;
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public void apito() {
        System.out.println("Piuuiiii");
    }

    public String getNome(){
        return nome;
    }

    public String getCor(){
        return cor;
    }

    public int getAnoproducao(){
        return anoProducao;
    }

    public int getLotacaomaxima(){
        return lotacaoMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoproducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }

    public void setLotacaomaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    @Override
    public String toString() {
        return "Trem [nome=" + nome + ", cor=" + cor + ", ano de producao=" + anoProducao + ", lotacao maxima=" + lotacaoMaxima +" ]";
    }
}


