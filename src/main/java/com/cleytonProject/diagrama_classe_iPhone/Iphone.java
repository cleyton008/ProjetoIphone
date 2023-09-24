	package com.cleytonProjetc.diagrama_classe_iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {System.out.println("Ligar para " + numero);}

    @Override
    public void atender(String numero) {System.out.println("Atender a ligação de " + numero);}

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {System.out.println("Iniciar correio de voz... " + mensagem);}

    @Override
    public void exibirPagina(String url) {System.out.println("Exibir página de " + url);}

    @Override
    public void adicionarNovaAba(String url) {System.out.println("Adicionar nova aba ");}

    @Override
    public void atualizarPagina() {System.out.println("Atualizar a página...");}

    @Override
    public void tocar() {System.out.println("Tocar a música...");}

    @Override
    public void pausar() {System.out.println("Pausar a reprodução da música...");}

    @Override
    public void selecionarMusica() {System.out.println("Selecionar a música desejada...");}
}
