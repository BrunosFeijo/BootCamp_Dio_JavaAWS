package org.example;

import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());
    private static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexao");
    }
    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Finalizou conexao");
    }
    public static void insereDados(Pessoa pessoa){
        //insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }
    public static void removeDados(Pessoa pessoa){
        //remove pssoa no DB
        LOGGER.info("Removeu dados");
    }
}
