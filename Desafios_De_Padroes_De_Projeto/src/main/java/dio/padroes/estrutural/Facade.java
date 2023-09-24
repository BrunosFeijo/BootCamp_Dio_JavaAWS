package dio.padroes.estrutural;

import dio.padroes.outrosubsistema.CepAPI;
import dio.padroes.subsistema.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
