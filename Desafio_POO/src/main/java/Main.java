public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        System.out.println("-----Navegador-----");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        System.out.println("\n-----Reprodutor Musical-----");
        iphone.selecionarMusica();
        iphone.pausar();
        iphone.tocar();

        System.out.println("\n-----Aparelho Telefônico-----");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
