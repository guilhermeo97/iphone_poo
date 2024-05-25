package funcionalidades;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public String tocar() {
        return "tocando música";
    }

    @Override
    public String pausar() {
        return "música pausada";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "selecionando música " + musica;
    }

    @Override
    public String exibirPagina(String url) {
        return "exibindo página " + url;
    }

    @Override
    public String adicionarAba() {
        return "adicionando nova aba";
    }

    @Override
    public String atualizarPagina() {
        return "atualizando página";
    }

    @Override
    public String ligar(String numero) {
        return "ligando para " + numero;
    }

    @Override
    public String Atender() {
        return "Alô!";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando correio de voz";
    }
    
}
