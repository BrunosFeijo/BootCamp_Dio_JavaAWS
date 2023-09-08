public class IPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

    @Override
    public void ligar() {
        System.out.println("IPhone ligado!");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicinada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
    }
}
