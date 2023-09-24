	package com.cleytonProjetc.diagrama_classe_iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.adicionarNovaAba("www.newtab.com");
        iphone.atender("+55 11 999125003");
        iphone.atualizarPagina();
        iphone.ligar("+55 11 999125003");
        iphone.pausar();
        iphone.exibirPagina("www.apple.com");
        iphone.iniciarCorreioVoz("Oii, preciso falar contigo. me retorna", "Cleyton");
        iphone.selecionarMusica();

    }
}
