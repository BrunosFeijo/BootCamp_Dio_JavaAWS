package dio.padroes.outrosubsistema;

import dio.padroes.criacional.SingletonEager;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
    }

    public static CepAPI getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Porto Alegre";
    }
    public String recuperarEstado(String cep){
        return "RS";
    }

}
