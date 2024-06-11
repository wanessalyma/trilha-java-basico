public class Usuario {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new Iphone();
        ReprodutorMusical reprodutorMusical = new Iphone();
        NavegadorInternet navegadorInternet = new Iphone();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar("+55 85 8888-9999");
        reprodutorMusical.selecionarMusica("Havana");
        reprodutorMusical.pausar();
        navegadorInternet.exibirPagina("www.google.com.br");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
