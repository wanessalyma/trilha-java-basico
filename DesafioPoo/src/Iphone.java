import java.util.Random;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
        atendeu();
    }
    public void atender(){
        System.out.println("Chamada Recebida atendida");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("atendeu?" + atendeu);
        return atendeu;
    }

    private void atendeu(){
        int tentativas = 0;
        boolean atendido = false;
        
        while (tentativas < 5 && !atendido) {
            if (tocando()) {
                atendido = true;
                System.out.println("Ligação atendida!");
            } else {
                System.out.println("Ligação não atendida. Tentando novamente.");
                tentativas++;
            }
        }
        if (!atendido) {
            System.out.println("Nenhuma resposta após 5 tentativas.");
            iniciarCorreioVoz();
        }
    }
    private void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }
    private void tocar(){
        System.out.println("Música tocando");
    }
    public void pausar(){
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a música " + musica);
        tocar();
    }
    public void exibirPagina(String url){
        System.out.println("Página Disponível " + url);
    } 
    public void adicionarNovaAba(){
        System.out.println("Adicionado nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }
}