package com.digitalinnovation.desafio.poo.java;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String versao;

    public IPhone(String modelo, String versao) {
        this.modelo = modelo;
        this.versao = versao;
    }

    // Métodos getter para modelo e versao
    public String getModelo() {
        return modelo;
    }

    public String getVersao() {
        return versao;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música no " + modelo + " versão " + versao);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no " + modelo + " versão " + versao);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada no " + modelo + " versão " + versao + ": " + musica);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + " usando " + modelo + " versão " + versao);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no " + modelo + " versão " + versao);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado no " + modelo + " versão " + versao);
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no " + modelo + " versão " + versao + ": " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no " + modelo + " versão " + versao);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no " + modelo + " versão " + versao);
    }
}