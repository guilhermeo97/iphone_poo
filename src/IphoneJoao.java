import funcionalidades.Iphone;

public class IphoneJoao {
    public static void main(String[] args) throws Exception {
       Iphone iphoneJoao = new Iphone();

       System.out.println(iphoneJoao.ligar("54992111294"));
       System.out.println(iphoneJoao.iniciarCorreioVoz());
       System.out.println(iphoneJoao.Atender());

       System.out.println(iphoneJoao.selecionarMusica("Stand by me"));
       System.out.println(iphoneJoao.tocar());
       System.out.println(iphoneJoao.pausar());

       System.out.println(iphoneJoao.exibirPagina("https://apple.com"));
       System.out.println(iphoneJoao.atualizarPagina());
       System.out.println(iphoneJoao.adicionarAba());
    }
}
